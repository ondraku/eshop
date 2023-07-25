package com.example.eshop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshop.product.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	Order findOrderById(Long id);

}
