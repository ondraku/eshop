package com.example.eshop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshop.product.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
