package com.spring.dao;

import java.util.List;

import com.spring.Entity.Product;

public interface ProductDao {
	void save(Product p);

	List<Product> findAll();
}