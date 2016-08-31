package com.niit.bikesbackend.dao;

import org.springframework.stereotype.Repository;

import com.niit.bikesbackend.model.Product;

import java.util.List;

public interface ProductDAO {
	// declare all CURD operations
		public boolean save(Product product);
		public boolean update(Product product);
		public boolean delete(Product product);
		
		
		public Product get(String id);
		public List<Product> list();
	}


