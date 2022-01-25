package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;
@Service
public class IUserService {
	@Autowired //DI
	UserRepository userRepository;
	@Transactional

	public void saveUser(User user) {
		userRepository.save(user);
		// throw new IllegalArgumentException();
		
	}

	public Iterable<User> getUsers() {
		return userRepository.findAll();
		
	}

	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
	}
	@Transactional

	public void deleteUser(Integer id) {
		
		 userRepository.deleteById(id);

	}
}
