package com.application.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.application.dao.CustomerDAO;
import com.application.model.Customer;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
	
/*	@Autowired
	private EntityManagerFactory entityFactory;

	@Bean
	public SessionFactory getSessionFactory() {
		if (entityFactory.unwrap(SessionFactory.class) == null) {
			throw new NullPointerException("factory is not a hibernate factory");
		}
		return entityFactory.unwrap(SessionFactory.class);
	}*/
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public final Session getSession() {
		//SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		if (session == null || session.isOpen() == false) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	@Override
	public List<Customer> getAllCustomers() throws HibernateException {
		Criteria hCriteria = getSession().createCriteria(Customer.class);
		return hCriteria.list();
	}
	
	@Override
	public Customer getCustomerById(Long id) throws HibernateException {
		Criteria hCriteria = getSession().createCriteria(Customer.class);
		hCriteria.add(Restrictions.eq("customerId", id));
		return (Customer) hCriteria.uniqueResult();
	}
	
}













