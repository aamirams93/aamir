package com.image.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.image.entity.Product;


@Controller
public class FormController {
	
	@GetMapping("/")
	public String getForm(Model model)
	{
		Product pb = new Product();
		model.addAttribute("product", pb);
		return "index";
	}
	@PostMapping("/product")
	public String handFormSubmit(Product pb,Model model)
	{
		System.out.println(pb);
		model.addAttribute("msg", "product save successfuly");
		return "success";
	}

}
