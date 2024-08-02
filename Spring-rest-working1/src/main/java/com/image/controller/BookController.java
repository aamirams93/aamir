package com.image.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.image.entity.Book;
import com.image.service.BookService;

@RestController
public class BookController
{
	@Autowired
	private BookService bs;

	@PostMapping("/addbook")
	public ResponseEntity<String> add(@RequestBody Book book)
	{
		String msg = bs.addBook(book);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping("/getbooks")
	public ResponseEntity<List<Book>> getAllBook()
	{
		List<Book> allbooks = bs.getAllBooks();
		return new ResponseEntity<List<Book>>(allbooks, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Book book)
	{
		String msg = bs.addBook(book);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<String> delete(@PathVariable Integer bookId)
	{
		String msg = bs.deleteBook(bookId);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
