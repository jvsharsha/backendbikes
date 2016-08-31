package com.niit.bikesbackend.dao;

import org.springframework.stereotype.Repository;

import com.niit.bikesbackend.model.Supplier;

import java.util.List;
@Repository
public interface SupplierDAO {
	// declare all CURD operations
		public boolean save(Supplier supplier);
		public boolean update(Supplier supplier);
		public boolean delete(Supplier supplier);
		
		
		public Supplier get(String id);
		public List<Supplier> list();
	}


