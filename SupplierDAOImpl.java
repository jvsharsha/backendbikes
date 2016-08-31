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

import com.niit.bikesbackend.model.Supplier;

@Repository(value = "supplierDAO")
@EnableTransactionManagement
public class SupplierDAOImpl implements SupplierDAO{
	//private static final Query SessionFactory = null;
	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}
	
	public SupplierDAOImpl() {
		System.out.println("in supplier DAO");
	}

	@Transactional
	public boolean save(Supplier supplier) {
		try {
			Session s=sessionFactory.getCurrentSession();
			s.save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean delete(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public Supplier get(String id) {

		String hql = "from supplier where id=" + " ' " + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> list = query.list();
		if (list == null)

			return null;
		else
			return list.get(0);
		}
	
	@Transactional
	public List<Supplier> list() {
		String hql = "from supplier";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();

	}

}
