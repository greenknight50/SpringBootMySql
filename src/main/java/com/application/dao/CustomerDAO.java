package com.application.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.application.model.Customer;

public interface CustomerDAO {
	
	List<Customer> getAllCustomers() throws HibernateException;

}
