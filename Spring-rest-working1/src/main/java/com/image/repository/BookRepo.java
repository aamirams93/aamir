package com.image.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.image.entity.Book;

public interface BookRepo extends CrudRepository<Book, Serializable>
{

}
