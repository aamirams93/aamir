package com.image.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Book_Dtls")
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_ID")
	private Integer bookid;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="BOOK_PRICE")
	private Double bookPrice;

}
