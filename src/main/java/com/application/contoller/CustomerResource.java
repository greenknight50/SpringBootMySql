package com.application.contoller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.model.Customer;
import com.application.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Customer> getAllCustomers() {
		ArrayList<Customer> customers = customerService.getAllCustomers();
		return customers;
	}

}
