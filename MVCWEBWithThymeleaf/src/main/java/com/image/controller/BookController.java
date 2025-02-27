package com.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.image.binding.BookStore;

@Controller
public class BookController
{
	@GetMapping("/")
	public String getBook(Model model)
	{
		BookStore bk  = new BookStore();
		model.addAttribute("book", bk);
		return "index";
	}
	
	@PostMapping("/book")
	public String saveBook(BookStore books,Model model)
	{
		model.addAttribute("msg","Successfull...!!!");
		return "success";
	}
}
