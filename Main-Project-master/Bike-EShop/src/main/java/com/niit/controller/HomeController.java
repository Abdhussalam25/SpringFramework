package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.service.CategoryService;

@Controller
public class HomeController {

	Logger logger = Logger.getLogger(HomeController.class);

	@Autowired
	private CategoryService categoryservice;

	public HomeController() {

		// logger.debug("Creating the instance for home Controller");

		System.out.println("Creating the instance for home Controller");
	}

	@RequestMapping("/")
	public String homepage() {
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	//@RequestMapping("/home")
	//public String home(HttpSession session) {
//		session.setAttribute("categoryDetails", categoryservice.getCategories());
//		return "home";
//	}

	@RequestMapping("/ContactUs")
	public String contact() {
		return "ContactUs";
	}

	@RequestMapping("/AboutUs")
	public String aboutus() {
		return "AboutUs";
	}

	@RequestMapping("/Login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		if (error != null)
			model.addAttribute("error", "Invalid Username and Password.. Please enter valid username and password");
		if (logout != null)
			model.addAttribute("logout", "Loggedout successfully..");
		return "LogIn";

	}

	@RequestMapping("/admin/product/home")
	public String adminPrductHome() {

		return "redirect:/home";
	}

	@RequestMapping("/admin/product/ContactUs")
	public String adminProductConctactUs() {
		return "redirect:/ContactUs";
	}

	@RequestMapping("/admin/product/AboutUs")
	public String adminProductAboutUs() {
		return "redirect:/AboutUs";
	}

	@RequestMapping("/all/product/home")
	public String allPrductHome() {

		return "redirect:/home";
	}

	@RequestMapping("/all/product/ContactUs")
	public String allProductContactUs() {
		return "redirect:/ContactUs";

	}

	@RequestMapping("/all/product/AboutUs")
	public String allProductAboutUs() {

		return "redirect:/AboutUs";
	}

	@RequestMapping("/cart/home")
	public String cartHome() {

		return "redirect:/home";
	}

	@RequestMapping("/cart/ContactUs")
	public String cartContactUs() {
		return "redirect:/ContactUs";

	}

	@RequestMapping("/cart/AboutUs")
	public String cartAboutUs() {

		return "redirect:/AboutUs";
	}
	@RequestMapping("all/product/viewproduct/home")
	public String viewProductHome(){
		return "redirect:/home";
		
	}
	@RequestMapping("all/product/viewproduct/ContactUs")
	public String viewProductContactUs(){
		return "redirect:/ContactUs";
		
	}
	@RequestMapping("all/product/viewproduct/AboutUs")
	public String viewProductAboutUs(){
		return "redirect:/AboutUs";
		
	}

}
