package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;
@Service
public class IUserService {
	@Autowired //DI
	UserRepository userRepository;

	public void saveUser(User user) {
		userRepository.save(user);
		
	}

}
