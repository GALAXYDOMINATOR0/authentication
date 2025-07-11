package com.authentication.authentication.service;

import com.authentication.authentication.model.User;
import com.authentication.authentication.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository, EmailService emailService) {
		this.userRepository = userRepository;
	}

	public List<User> allUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
}