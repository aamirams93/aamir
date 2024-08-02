package com.image.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.image.binding.Book;

@RestController
public class BookController
{
	@GetMapping(value = "/product", produces = { "application/xml", "application/json" })
	public ResponseEntity<Book> getBook()
	{
		Book b = new Book();
		b.setBookName("spring");
		b.setAuthorName("aamir");
		b.setPrice(212.00);
		return new ResponseEntity<>(b, HttpStatus.OK);
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		Book b1 = new Book("pyhton", "rah", 200.00);
		Book b2 = new Book("java", "rob", 400.00);
		Book b3 = new Book("c++", "branjane", 500.00);

		List<Book> products = Arrays.asList(b1, b2, b3);

		return new ResponseEntity<>(products, HttpStatus.OK);
	}

}
