package com.image.service;

import java.util.List;

import com.image.entity.Book;

public interface BookService
{
	public String addBook(Book book);
	
	public List<Book> getAllBooks();
	
	//public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);
}
