package com.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GreetController
{
	@GetMapping("/greet")
	public String getGreet(Model model)
	{
		String msgTxt = "Good Morning...!!!";
		model.addAttribute("msg",msgTxt);
		return "greet";
	}
}
