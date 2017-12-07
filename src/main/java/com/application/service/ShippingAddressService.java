package com.application.service;

import java.util.List;

import com.application.model.ShippingAddress;

public interface ShippingAddressService {
	List<ShippingAddress> getAllShippingAddressRecords();
	
	ShippingAddress getShippingAddressById(Long shippingAddressId);
	
	List<ShippingAddress> getShippingAddressByCity(String city);
}
