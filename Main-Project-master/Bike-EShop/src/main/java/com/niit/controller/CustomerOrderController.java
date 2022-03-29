package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.service.CustomerOrderService;

@Controller
public class CustomerOrderController {
	
	@Autowired
	private CustomerOrderService customerOrderService;
	
	@RequestMapping("/order/{cartId}")
	public String createOrder(@PathVariable int cartId ){
		System.out.println("Entering into CustomerOrderControl");
		
		return "redirect:/checkout?cartId=" + cartId;
		
		
		
	}

}
