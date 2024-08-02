package com.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.image.entity.UserSetting;

import jakarta.validation.Valid;


@Controller
public class WebController
{
	@GetMapping("/")
	public String getData(Model model)
	{
		UserSetting userObj = new UserSetting();
		model.addAttribute("user", userObj);
		return "index";
	}
	
	
	@PostMapping("/register")
	public String handleStringBtn(@Valid UserSetting userForm,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			return "index";
		}
		
		model.addAttribute("up", "Your Registration Successfull...!!!");
		return "success";
	}

}
