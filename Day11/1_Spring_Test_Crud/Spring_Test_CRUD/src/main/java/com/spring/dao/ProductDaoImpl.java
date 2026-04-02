package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	RowMapper<Product> mapper = (rs, rowNum) -> {
		Product p = new Product();
		p.setId(rs.getInt("id"));
		p.setProductName(rs.getString("product_name"));
		p.setProductCategory(rs.getString("product_category"));
		p.setProductDescription(rs.getString("product_description"));
		return p;
	};

	public void save(Product p) {
		jdbcTemplate.update("INSERT INTO product(product_name, product_category, product_description) VALUES (?,?,?)",
				p.getProductName(), p.getProductCategory(), p.getProductDescription());
	}

	public List<Product> findAll() {
		return jdbcTemplate.query("SELECT * FROM product", mapper);
	}
}