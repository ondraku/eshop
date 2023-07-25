package com.example.eshop.product.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.eshop.product.model.User;
import com.example.eshop.product.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyUserDetailsServiceImpl implements UserDetailsService {

	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

		final User byUsername = userRepository.findByUsername(username);

		if (byUsername == null || byUsername.getUsername().isEmpty()) {
			throw new UsernameNotFoundException("User not found");
		}

		return byUsername;
	}

}
