package com.niit.bikesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.bikesbackend.dao.SupplierDAO;
import com.niit.bikesbackend.model.Supplier;

public class SupplierTest {
	/*
	static AnnotationConfigApplicationContext context;
	

	public SupplierTest() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
			}


	public static void main (String[] args){

		
		  SupplierTest st= new SupplierTest();
		
		
		
		Supplier supplier = (Supplier) context.getBean("supplier");
		
		supplier.setId("CG002");
		supplier.setName("CG0016");
		supplier.setAddress("hyderabad");
		
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		supplierDAO.save(supplier);
		/*if ( supplierDAO.save(supplier)==true)
		{
			System.out.println("Supplier created Successfully");
		}
		else
		{
			System.out.println("Supplier not created Successfully");
		}
}*/
}