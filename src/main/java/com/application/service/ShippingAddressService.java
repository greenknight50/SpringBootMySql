package com.application.service;

import java.util.List;

import com.application.model.ShippingAddress;

public interface ShippingAddressService {
	
	ShippingAddress saveShippingAddress(ShippingAddress shippingAddress);
	
	List<ShippingAddress> getAllShippingAddressRecords();
	
	ShippingAddress getShippingAddressById(Long shippingAddressId);
	
	List<ShippingAddress> getShippingAddressByCity(String city);
	
	List<ShippingAddress> getShippingAddressByCustomerId(Long customerId);
}
