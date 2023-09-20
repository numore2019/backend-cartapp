package com.numa.cartapp.services;

import java.util.List;

import com.numa.cartapp.models.entities.Product;

public interface ProductService {

	List<Product> findAll();
	
}
