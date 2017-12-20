package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.CustomerDAO;
import com.application.model.Customer;
import com.application.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

}
