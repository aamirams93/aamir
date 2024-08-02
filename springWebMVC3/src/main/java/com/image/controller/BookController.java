package com.image.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController
{
	@GetMapping("/book")
	public String getBook(Model model)
	{
		//sending data to binding object
		Book book = new Book(101,"Spring Boot",200.00);
		
		// adding to to binding Ui
		model.addAttribute("book", book);
		
		//return book jsp page
		return "book";
	}
	
	@GetMapping("/books")
	public String getAllBooks(Model model)
	{
		//sending data to binding object
		Book book = new Book(101,"Spring Boots",200.00);
		Book book1 = new Book(101,"Spring Boot1",200.00);
		Book book2 = new Book(101,"Spring Boot2",200.00);
		List<Book> bookList = Arrays.asList(book,book1,book2);		
		// adding to to binding Ui
		model.addAttribute("books", bookList);
		
		//return book jsp page
		return "book";
	}
}
