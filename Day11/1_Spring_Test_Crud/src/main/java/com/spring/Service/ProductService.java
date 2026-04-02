package com.spring.Service;

import java.util.List;
import com.spring.Entity.Product;

public interface ProductService {
	void add(Product product);

	List<Product> getAll();
}
