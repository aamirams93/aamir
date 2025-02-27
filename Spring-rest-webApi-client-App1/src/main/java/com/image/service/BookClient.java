package com.image.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.image.entity.Book;

@Service
public class BookClient
{
	///HTTP Post Request with WebClient
	public void invokeSaveBook()
	{
		Book bk = new Book();
		bk.setBookName("angular");
		bk.setBookPrice(2000.00);
		
		String apiUrl = "https://ashokit-book-app.herokuapp.com/book";
		
		WebClient client = WebClient.create();
	    String res = client.post()
		      .uri(apiUrl) // Endpoint URL
		      .bodyValue(bk) // HTTP Request Body Data
		      .retrieve() // Retrieve HTTP Response Body
		      .bodyToMono(String.class) //Bind Response to string var
		      .block(); // Make it as Sync client
		System.out.println(res);
	}
	
	
	//HTTP GET Request using WebClient
	
	public void getBooks()
	{
		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		WebClient client =  WebClient.create();
//		String res = client.get() // GET Request
//			  .uri(apiUrl) // Endpoint URL
//			  .retrieve() // retrieve response body
//			  .bodyToMono(String.class) // bind response data to string var
//			  .block(); // make it sync
//		
		Book[]  responseData = client.get()
									 .uri(apiUrl)
									 .retrieve()
									 .bodyToMono(Book[].class)
									 .block();
		for(Book b : responseData)
		{
			System.out.println(b);
		}
	}
	
	public void getAsynBooks()
	{
		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		
		WebClient client = WebClient.create();
		client.get()
		      .uri(apiUrl)
		      .retrieve()
		      .bodyToMono(Book[].class)
		      .subscribe(BookClient::responseHandler); // asynchronous method
		
		
		System.out.println("************** Resquest sent *************");

	}
	
	public static void responseHandler(Book[] books)
	{
		for(Book b:books)
		{
			System.out.println(b);
		}
	}
}
