package com.niit.bikesbackend.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.bikesbackend.dao.CategoryDAO;
import com.niit.bikesbackend.dao.CategoryDAOImpl;
import com.niit.bikesbackend.dao.ProductDAO;
import com.niit.bikesbackend.dao.ProductDAOImpl;
import com.niit.bikesbackend.dao.SupplierDAO;
import com.niit.bikesbackend.dao.SupplierDAOImpl;
import com.niit.bikesbackend.dao.UserDetailsDAO;
import com.niit.bikesbackend.dao.UserDetailsDAOImpl;
import com.niit.bikesbackend.model.Category;
import com.niit.bikesbackend.model.Product;
import com.niit.bikesbackend.model.Supplier;
import com.niit.bikesbackend.model.UserDetails;

@Configuration
@ComponentScan("com.niit.bikesbackend")
@EnableTransactionManagement

public class ApplicationContextConfig {
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/test1"); 
	    dataSource.setUsername("sa");
	    dataSource.setPassword("");
	 
	    return dataSource;
	}
	private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    properties.put("hibernate.hbm2ddl.auto", "update");
	    return properties;
	}
	@Autowired
	@Bean(name="sessionfactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		 
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    sessionBuilder.addProperties(getHibernateProperties());
	 
	    sessionBuilder.addAnnotatedClasses(Category.class);
	   sessionBuilder.addAnnotatedClass(Supplier.class);
	   sessionBuilder.addAnnotatedClass(Product.class);
	   sessionBuilder.addAnnotatedClass(UserDetails.class);
	   
	    return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(
	        SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	            sessionFactory);
	 
	    return transactionManager;
	}
	
	/*@Autowired
	@Bean(name = "categoryDAO")
	public CategoryDAOImpl getCategoryDAO(SessionFactory sessionFactory){
		return new CategoryDAOImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name = "ProductDAO")
	public ProductDAO getProductDAO(SessionFactory sessionFactory){
		return(ProductDAO) new ProductDAOImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name = "product")
	public Product getProduct (){
		return new Product();
	}
	
	
	
	@Autowired
	@Bean(name = "SupplierDAO")
	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory){
		return(SupplierDAO) new SupplierDAOImpl(sessionFactory);        
	}*/
	
	/*@Autowired
	@Bean(name = "supplier")
	public Supplier getSupplier (){
		return new Supplier();
	}
	
	

	
	@Autowired
	@Bean(name = "UserDetailsDAO")
	public UserDetailsDAO getUserDetailsDAO(SessionFactory sessionFactory){
		return(UserDetailsDAO) new UserDetailsDAOImpl(sessionFactory);
	}
	
	
	@Autowired
	@Bean(name = "userDetails")
	public UserDetails getUserDetails  (){
		return new UserDetails ();
	}
	*/
	
}




