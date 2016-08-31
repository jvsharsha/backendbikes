package com.niit.bikesbackend;

//import static org.junit.Assert.*;

import java.util.List;

//import org.junit.Before;
//import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.bikesbackend.dao.CategoryDAO;
import com.niit.bikesbackend.model.Category;

public class TestCaseCategory {

	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	Category category;
	
/*AnnotationConfigApplicationContext context;
@Before
public void init()
{
 context = new AnnotationConfigApplicationContext();
 context.scan("com.niit");
 context.refresh();
  
         categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		 category = (Category) context.getBean("category");
}

@Test
public void categoryListTestCase()
{
	List<Category>list =categoryDAO.list();
	int rowCount=list.size();
	assertEquals("category list test case", rowCount, 5);
	 
}

@Test
public void categoryAddTestcase()
{
	category.setId("abcd");
	category.setName("abcdef");
	category.setDescription("wrwre");
	
	boolean flag= categoryDAO.save(category);
	assertEquals(flag,true);
}

@Test

public void categoryGetTestcase()
{
	category= categoryDAO.get("CG001");
	System.out.println(category.getDescription());
	System.out.println(category.getName());
	
	assertEquals(category.getName(),"asdfs");
}*/

}


