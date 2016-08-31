package com.niit.bikesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.bikesbackend.configuration.ApplicationContextConfig;
import com.niit.bikesbackend.dao.CategoryDAO;
import com.niit.bikesbackend.model.Category;

public class CategoryTest {
	/*
	
static AnnotationConfigApplicationContext context;
public  CategoryTest(){
	
	
	context =new AnnotationConfigApplicationContext();
	System.out.println("in controller");
	context.scan("com.niit.*");
	context.refresh();
	}
	
	public static void main(String[] args ){	

	
	
	
	//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	//context.scan("com.niit");
	//context.refresh();
	
	CategoryTest t= new CategoryTest();
	//Category category = (Category) context.getBean("category");
	Category category = new Category();
	category.setId("CG003");
	category.setName("CG0016");
	category.setDescription("secundrabad");
	CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	categoryDAO.save(category);
	
	
	/*if ( categoryDAO.save(category)==true)
	{
		System.out.println("Category created Successfully");
	}
	else
	{
		System.out.println("Category not created Successfully");
	} 
} */
}
