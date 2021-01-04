package com.example.demo.com.example.service;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.com.example.dao.UserRepository;
import com.example.demo.com.example.model.User;

@Service

public class UserService {
	@Autowired
	//injected
	private UserRepository repository;	
	
	// add data via JPA	
	@PostConstruct
	public void initDB()
	
	{
		
		List<User> users = new ArrayList<>();
	
		users.add(new User(312, "x", "IT",23));
		users.add(new User(313, "y", "sales",23));
		users.add(new User(314, "p", "IT",26));
		users.add(new User(315, "q", "IT",28));
		repository.saveAll(users);
	}
	
	//get list of users
	public List<User> getUsers()
	{
		
		return repository.findAll();
	}
	
	public void addUsers(User users)
	{
		
		repository.saveAndFlush(users);
	}
	
	
	

}
