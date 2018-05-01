package com.application.service;

import java.util.List;

import com.application.model.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerById(Long id);

}
