package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class SillyController 
{
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "form";
	}
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model,@RequestParam("StudentName") String name) 
	{
		//String name=request.getParameter("StudentName");
		name=name.toUpperCase();
		String result="Yo "+name+"!";
		model.addAttribute("message",result);
		String m="message";
		System.out.println(result+" "+model.getAttribute(m));
	
		return "display";
		
	}

}
