package com.niit.bikesbackend.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.bikesbackend.model.Category;

import java.util.List;


public interface CategoryDAO {
	// declare all CURD operations
		public boolean save(Category category);
		public boolean update(Category category);
		public boolean delete(Category category);
		
		
		public Category get(String id);
		public List<Category> list();
	}


