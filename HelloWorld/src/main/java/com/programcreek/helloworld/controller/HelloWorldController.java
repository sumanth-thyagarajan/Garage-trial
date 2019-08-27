package com.programcreek.helloworld.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/Join-us")
	public String showMessage() {
		System.out.println("in controller");
		return "join-us";
	}
	@RequestMapping("/Elite-memebers")
	public String loginPage()
	{
		return "elite-members";
	}
	@RequestMapping("/view-elite")
	public String viewElite()
	{
		return "profile";
	}
}