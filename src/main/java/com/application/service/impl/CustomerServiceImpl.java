package com.application.service.impl;

import java.util.ArrayList;

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
	public ArrayList<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

}
