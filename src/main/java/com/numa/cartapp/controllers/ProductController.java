package com.numa.cartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numa.cartapp.models.entities.Product;
import com.numa.cartapp.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;

	@GetMapping("/products")
	public List<Product> list(){
		return service.findAll();
		
	}
}
