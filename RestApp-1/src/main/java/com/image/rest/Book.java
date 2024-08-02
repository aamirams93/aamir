package com.image.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book
{
	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBook(@PathVariable("name") String name)
	{
		String payLoad = name + ", this book is good";
		return new ResponseEntity<>(payLoad, HttpStatus.OK);
		// url will be :- http://localhost:8081/book/Python
	}
}
