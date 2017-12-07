package com.application.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.ShippingAddress;
import com.application.service.ShippingAddressService;

@RestController
@RequestMapping("/shipping")
public class ShippingAddressController {
	
	@Autowired
	private ShippingAddressService shippingAddressService;
	
	@RequestMapping("/all")
	public List<ShippingAddress> getAllShippingAddresses() {
		return shippingAddressService.getAllShippingAddressRecords();
	}
	
	@RequestMapping(value = "/id/{id}")
	public ShippingAddress getShippingAddressById(@PathVariable("id") Long shippingAddressId) {
		ShippingAddress shippingAddress = shippingAddressService.getShippingAddressById(shippingAddressId);
		System.out.println("Shipping address retrived: " + shippingAddress);
		return  shippingAddress;
	}
	
	@RequestMapping("/city/{city}")
	public List<ShippingAddress> getShippingAddressByName(@PathVariable("city") String city) {
		return shippingAddressService.getShippingAddressByCity(city);
	}
}
