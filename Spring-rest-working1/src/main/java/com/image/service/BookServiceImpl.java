package com.image.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.image.entity.Book;
import com.image.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService
{
	private BookRepo repo;

	public BookServiceImpl(BookRepo repo)
	{
		this.repo = repo;
	}

	@Override
	public String addBook(Book book)
	{
		Integer bookId = book.getBookid();

		Book save  = repo.save(book);
		if (bookId  == null) {
			return "Record Inserted...!!";
		} else {
			return "Book Updated";
		}

	}

	@Override
	public List<Book> getAllBooks()
	{
		return (List<Book>) repo.findAll();

	}

	@Override
	public String deleteBook(Integer bookId)
	{
		repo.deleteById(bookId);
		return "Book Deleted";
	}

}
