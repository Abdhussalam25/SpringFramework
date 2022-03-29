package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.Customer;
import com.niit.model.Product;
import com.niit.service.CartItemService;
import com.niit.service.CartService;
import com.niit.service.CustomerService;
import com.niit.service.ProductService;

@Controller
public class CartItemController {
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	 ProductService productservice;
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("addCartItem/{id}")// i changed this from pid
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void addCartItem(@PathVariable(value="id") int id){ //i changed it from product_id
		//Line to get the principal object
	   User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	   String userName=user.getUsername();
	   Customer customer= customerService.getCustomerByUsername(userName);
	   Cart cart=customer.getCart();
	   
		List<CartItem> cartItems= cart.getCartItems();
	   Product product=productservice.getProductById(id);  // this method is already exists
	  
	   for (int i = 0; i <cartItems.size(); i++) {
			CartItem cartItem=cartItems.get(i);
			Product p=cartItem.getProduct();
			     //1    ==  1
			if(p.getId()==id){
				cartItem.setQuantity(cartItem.getQuantity() + 1);//increment the quantity
				cartItem.setTotalPrice(cartItem.getQuantity() * p.getPrice()); //update the total price
				cartItemService.addCartItem(cartItem);//update the quantity in the cartitem
				return;
				
			}	
	    
	      }
	   
	   CartItem cartItem=new CartItem();
		cartItem.setQuantity(1);
		cartItem.setTotalPrice(cartItem.getQuantity() * product.getPrice());
		cartItem.setProduct(product); //set product id
		cartItem.setCart(cart);//set cart id
		cartItemService.addCartItem(cartItem); //insert query	
		
	}
	
	@RequestMapping("/cart/removeCartItem/{cartItemId}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void removeCartItem(@PathVariable int cartItemId){
	CartItem cartItem=cartItemService.getCartItem(cartItemId);
	cartItemService.removeCartItem(cartItem);
	}
	@RequestMapping("/cart/removeAllCartItems/{cartId}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void removeAllCartItems(@PathVariable int cartId){
	Cart cart=cartService.getCart(cartId);
	cartItemService.removeAllCartItems(cart);
	}

}
	


