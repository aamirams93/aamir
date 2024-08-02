package com.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
