package com.example.eshop.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eshop.product.model.User;
import com.example.eshop.product.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping("/users")
	public ResponseEntity<String> saveNewUser(@RequestBody User user) {
		userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("New user saved.");
	}

}
