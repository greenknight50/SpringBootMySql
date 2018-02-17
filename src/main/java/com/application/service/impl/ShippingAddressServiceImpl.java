package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.ShippingAddressDAO;
import com.application.model.ShippingAddress;
import com.application.service.ShippingAddressService;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {

	@Autowired
	private ShippingAddressDAO shippingAddressDAO;
	
	@Override
	public ShippingAddress saveShippingAddress(ShippingAddress shippingAddress) {
		return shippingAddressDAO.save(shippingAddress);
	}
	
	@Override
	public List<ShippingAddress> getAllShippingAddressRecords() {
		return shippingAddressDAO.findAll();
	}

	@Override
	public ShippingAddress getShippingAddressById(Long shippingAddressId) {
		return shippingAddressDAO.findOne(shippingAddressId);
	}

	@Override
	public List<ShippingAddress> getShippingAddressByCity(String city) {
		return shippingAddressDAO.findByCity(city);
	}

	@Override
	public List<ShippingAddress> getShippingAddressByCustomerId(Long customerId) {
		return shippingAddressDAO.findByCustomer_CustomerId(customerId);
	}

}
