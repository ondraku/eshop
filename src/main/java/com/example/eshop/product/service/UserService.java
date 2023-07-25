package com.example.eshop.product.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.eshop.product.model.User;
import com.example.eshop.product.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public void saveUser(User user) {

		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setUsername(user.getUsername());

		userRepository.save(user);
	}

}
