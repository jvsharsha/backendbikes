package com.niit.bikesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.bikesbackend.dao.ProductDAO;
import com.niit.bikesbackend.model.Product;

public class ProductTest {
	/*
	
	static AnnotationConfigApplicationContext context;
	
	public   ProductTest(){
		context =new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		}
	
	
	
		public static void main (String[] args){
			
		
		 ProductTest t= new ProductTest();
			
			Product product  = (Product) context.getBean("product");
			
		
			product.setId("p22");
			product.setName("iphone");
			product.setPrice(65000);
			product.setDescription("the best phone in world");
			
			ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
			productDAO.save(product);
			
	    /*if ( productDAO.save(product)==true)
		{
			System.out.println("Product created Successefully");
		}
		else
		{
			System.out.println("Product not created ");
		}
	
		}*/
	
}
