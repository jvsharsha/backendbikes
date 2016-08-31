package com.niit.bikesbackend.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.SessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bikesbackend.model.Product;

@Repository(value = "productDAO")
@EnableTransactionManagement
public class ProductDAOImpl implements ProductDAO {
	//private static final Query SessionFactory = null;
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}
	
	public ProductDAOImpl (){
		System.out.println("in product DAO");
		
	}

	@Transactional
	public boolean save(Product Product) {
		try {
		Session s=sessionFactory.getCurrentSession();
				s.save(Product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean update(Product Product) {
		try {
			sessionFactory.getCurrentSession().update(Product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean delete(Product Product) {
		try {
			sessionFactory.getCurrentSession().delete(Product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public Product get(String id) {

		String hql = "from Product where id=" + " ' " + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> list = query.list();
		if (list == null)

			return null;
		else
			return list.get(0);
		}
	
	@Transactional
	public List<Product> list() {
		String hql = "from Product";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();

	}

}
