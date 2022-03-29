package com.niit.controller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



import com.niit.model.Product;
import com.niit.service.CategoryService;
import com.niit.service.ProductService;

@Controller
public class ProductController {
	
	
	Logger logger= Logger.getLogger(ProductController.class);

	public ProductController() {
		
		logger.debug("Creating the instance for product Controller");
		//System.out.println("CREATING INSTANCE FOR product CONTROLLER");
	}
@Autowired
private ProductService productservice;
@Autowired
private CategoryService categoryservice;

	@RequestMapping("admin/product/productform")
	public String getProductForm(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("categories", categoryservice.getCategories());
		return "ProductForm";
	}
	
	@RequestMapping("admin/product/addProduct")
public String saveProduct(@Valid @ModelAttribute(value="product") Product product,BindingResult result){
		
		logger.debug("AFTER GETTING THE PRODUCT"); 
		
		if(result.hasErrors())
			return "ProductForm";
		Product newProduct=productservice.saveProduct(product);
		
		
		 MultipartFile prodImage=product.getImage();
		if(!prodImage.isEmpty()){
			Path paths=
	Paths.get("E:/SALAM_ MAIN PROJECTS/Bike-EShop/src/main/webapp/resources/images/"+ product.getId()+".png");
		try {
			prodImage.transferTo(new File(paths.toString()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	return "redirect:/all/product/getAllProducts";
	}
	
	@RequestMapping("/all/product/getAllProducts")
	public String getAllProducts(Model model){
		List<Product> products=productservice.getAllProducts();
		//Assigning list of products to model attribute products
		model.addAttribute("productlist",products);
		return "productlist";
	}
	
	@RequestMapping("/all/product/viewproduct/{id}")
	public String viewProduct(@PathVariable int id,Model model){
		Product product=productservice.getProductById(id);
		model.addAttribute("product",product);
	return "viewproduct";
	}

	@RequestMapping("/admin/product/deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id){
		productservice.deleteProduct(id);
		return "redirect:/all/product/getAllProducts";
	}
	@RequestMapping("/admin/product/editform/{id}")
	public String editProductForm(@PathVariable int id,Model model){
		Product product=productservice.getProductById(id);
		model.addAttribute("product",product);
		model.addAttribute("categories",categoryservice.getCategories());
		return "editproductform";
	}
	@RequestMapping("/admin/product/editProduct")
	public String editProductDetails(@Valid @ModelAttribute("product") Product product,
			BindingResult result){
		if(result.hasErrors())
			return "editproductform";
		 MultipartFile prodImage=product.getImage();
			if(!prodImage.isEmpty()){
				Path paths=
		Paths.get("E:/SALAM_ MAIN PROJECTS/Bike-EShop/src/main/webapp/resources/images/"+ product.getId()+".png");
			try {
				prodImage.transferTo(new File(paths.toString()));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
			
		
		productservice.updateProduct(product);
		return "redirect:/all/product/getAllProducts";
	}
	
	@RequestMapping("/all/product/productsByCategory")
	public String getProductsByCategory(@RequestParam(name="searchCondition") String searchCondition,
			Model model){
		List<Product> products=productservice.getAllProducts();
		//Assigning list of products to model attribute products
		model.addAttribute("productlist",products);
		model.addAttribute("searchCondition",searchCondition);
		return "productlist";
	}


	
	

}
