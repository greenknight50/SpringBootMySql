package com.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.model.ShippingAddress;

public interface ShippingAddressDAO extends JpaRepository<ShippingAddress, Long>{
	
	List<ShippingAddress> findByCity(String city);
	
	ShippingAddress findByAddressLine1(String addressLine1);
	
}
