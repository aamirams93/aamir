package com.image.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.image.binding.Product;

@RestController
public class ProductController
{
	@PostMapping(
	        value = "/product",
	        consumes = {"application/json","application/jxml"}
	    )
	public ResponseEntity<String> addproduct(@RequestBody Product pr)
	{
		System.out.println(pr);
		String msg = "successfully";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
}
