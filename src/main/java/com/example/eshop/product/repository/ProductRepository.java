package com.example.eshop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshop.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findProductById(Long id);

}
