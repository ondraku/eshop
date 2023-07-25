package com.example.eshop.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eshop.product.model.Order;
import com.example.eshop.product.repository.OrderRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;

	public Order getProductById(final long id) {
		return orderRepository.findOrderById(id);
	}

	public List<Order> findAllOrders() {
		return orderRepository.findAll();
	}

}
