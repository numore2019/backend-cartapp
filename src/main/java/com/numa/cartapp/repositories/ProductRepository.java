package com.numa.cartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.numa.cartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

	//Tambien podemos tener nuestros propios metodos personalizados con la anotacion @Query y poner la consulta JPA
}
