package com.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@PersistenceContext
	private EntityManager em;

	public void add(Product product) {
		em.persist(product);
	}

	public List<Product> getAll() {
		return em.createQuery("from Product", Product.class).getResultList();
	}
}
