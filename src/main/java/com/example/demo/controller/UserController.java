package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
@RestController
public class UserController {
	@Autowired
	IUserService userService;

	@GetMapping("/user")
	Iterable<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/user/{id}")
	Optional<User> getUsers(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}

	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createUser(@RequestBody @Valid User user) {
		System.out.println(user.getName());
		userService.saveUser(user);
	}

	@DeleteMapping("/user")
	void deleteUser() {
		// Removed the word comments
	}
}
