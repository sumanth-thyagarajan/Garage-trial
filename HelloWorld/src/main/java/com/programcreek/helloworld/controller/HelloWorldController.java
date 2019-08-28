package com.programcreek.helloworld.controller;
 
import javax.servlet.http.HttpServletRequest;

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
	public String viewElite(@RequestParam("Regno") String regno,@RequestParam("Password") String pass, Model model)
	{
		if(regno.equals("")||pass.equals(""))
		{
			String s="*Please enter valid input*";
			model.addAttribute("message",s);
			return "elite-members";
		}
		else if(regno.equals("tn81z7537"))
		{
			if(pass.equals("sumanth"))
			{
				return "profile";
				
			}
			else
			{
				String s="*Please enter valid input*";
				model.addAttribute("message",s);
				return "elite-members";
				
			}
		}
		String s="*Please enter valid input*";
		model.addAttribute("message",s);
		//	return "elite-members";
		return "elite-members";
	}
	@RequestMapping("/process-Form")
	public String processForm(HttpServletRequest request, Model model)
	{
		Vehicle veh=new Vehicle();
		veh.setFirstname(request.getParameter("Firstname"));
		veh.setLastname(request.getParameter("Lastname"));
		veh.setGender(request.getParameter("Gender"));
		veh.setVehcat(request.getParameter("VehCat"));
		veh.setRegno(request.getParameter("RegNo"));
		veh.setAddress(request.getParameter("Doorno"),request.getParameter("Area"),request.getParameter("Districts"),request.getParameter("State"),request.getParameter("country"));
		String s=""+veh+" "+veh.getMessage();
		model.addAttribute("message",s);
		return "process-form";
	}
	@RequestMapping("/Logout")
	public String viewLogout()
	{
		return "home-page";
	}
}