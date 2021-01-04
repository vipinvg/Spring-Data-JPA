package com.example.demo.com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.com.example.model.User;
import com.example.demo.com.example.service.UserService;

@RestController
@RequestMapping("/spring-data-jpa")
public class UserController {

	@Autowired
	public	UserService service;
	@GetMapping ("/getUsers")
	public List<User> getAllUsers()
	
	{
		return service.getUsers();
	}
	@PostMapping ("/addUsers")

public String addUsers(@RequestBody User users)
	
	{
		service.addUsers(users);
		return "Success !";
	}
}