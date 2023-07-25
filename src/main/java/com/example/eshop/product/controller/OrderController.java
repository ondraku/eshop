package com.example.eshop.product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.eshop.product.service.OrderService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class OrderController {

	private OrderService orderService;

}
