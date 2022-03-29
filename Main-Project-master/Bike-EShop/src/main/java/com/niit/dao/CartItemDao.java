package com.niit.dao;

import com.niit.model.Cart;
import com.niit.model.CartItem;

public interface CartItemDao {
	
	public void addCartItem(CartItem cartItem);

	 CartItem getCartItem(int cartItemId);

	public void removeCartItem(CartItem cartItem);

	public void removeAllCartItems(Cart cart);

}
