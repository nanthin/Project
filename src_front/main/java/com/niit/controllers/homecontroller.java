package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.services.ProductServices;

@Controller
public class homecontroller{
	

	@Autowired
	private ProductServices productServices;
	homecontroller()
	{
		System.out.println("gud evening");
	}
@RequestMapping("/")
public String homepage(HttpSession session) {
	 session.setAttribute("categories",productServices.getAllCategories());
	
	 return "home";
	   
}
	@RequestMapping("/aboutus")
	public String aboutus(){
		
		return "aboutus";
		
		
	}
	
	@RequestMapping("/contactus")
	public String contactus(){
		return "contactus";
	}	
	
	@RequestMapping("/login")
	
	public String login(@RequestParam(required=false) String error,Model model){
		if(error!=null)
			model.addAttribute("error","invalid username/password");
		return "Login";
		
	}
	
	
	



}

