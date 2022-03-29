package com.niit.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.Customer;
import com.niit.service.CustomerService;

@Controller
public class CustomerController {

	Logger logger = Logger.getLogger(ProductController.class);

	public CustomerController() {

		logger.debug("Creating the instance for Customer controller");
	}
	
	@Autowired
	private CustomerService customerservice;

	@RequestMapping("/all/registerationform")
	public String getResgistrationForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "register";

	}
	
	
	
	@RequestMapping("/all/registercustomer")
	public String registerCustomer(@Valid @ModelAttribute(value="customer") Customer customer, BindingResult result, Model model)
	{
		
		if(result.hasErrors())
			return "register";
		try{
		customerservice.saveCustomer(customer);
		}
		catch(Exception e){
			model.addAttribute("duplicateUserName","Username already exists please enter another one");
			System.out.println("Exception is " + e.getMessage());
			return "register";
		}
		model.addAttribute("registrationsuccess", "Registered Successfully.. kindly login again with your username and password");
		return "LogIn";
		//"redirect:/all/product/getAllProducts";
		//"redirect:/home";
	}
	
/**	@RequestMapping("/all/home")
	
	 public String Home(){
		return "redirect:/home";
		
	}
	
	@RequestMapping("/all/ContactUs")
	public String contactUs(){
		return "redirect:/ContactUs";
		
	}
	
	@RequestMapping("/all/AboutUs")
	public String aboutUs(){
		return "redirect:/AboutUs";
		
	}*/

	
	
	
	
	
}
