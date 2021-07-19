package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController 
{
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "form";
	}
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model,@RequestParam("StudentName") String name) 
	{
		//String name=request.getParameter("StudentName");
		name=name.toLowerCase();
		String result="Hey "+name+"!"+"How are You";
		model.addAttribute("message",result);
		String m="message";
		System.out.println(result+" "+model.getAttribute(m));
	
		return "display";
		
	}
}
