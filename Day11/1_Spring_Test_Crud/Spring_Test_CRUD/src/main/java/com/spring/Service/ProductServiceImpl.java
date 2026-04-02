package com.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity.Product;
import com.spring.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	public void add(Product p) {
		dao.save(p);
	}

	public List<Product> getAll() {
		return dao.findAll();
	}
}