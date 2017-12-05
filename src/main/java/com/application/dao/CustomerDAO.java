package com.application.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.application.model.Customer;

public interface CustomerDAO {
	
	ArrayList<Customer> getAllCustomers() throws HibernateException;

}
