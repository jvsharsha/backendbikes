package com.niit.bikesbackend.dao;

import org.springframework.stereotype.Repository;

import com.niit.bikesbackend.model.UserDetails;

import java.util.List;
@Repository
public interface UserDetailsDAO {
	// declare all CURD operations
		public boolean save(UserDetails userdetails);
		public boolean update(UserDetails userdetails);
		public boolean delete(UserDetails userdetails);
		
		
		public UserDetails get(String id);
		public List<UserDetails> list();
	}


