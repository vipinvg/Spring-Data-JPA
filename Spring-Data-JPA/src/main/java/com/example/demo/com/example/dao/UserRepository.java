package com.example.demo.com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.com.example.model.User;




public interface UserRepository extends JpaRepository <User, Integer> {

	//List<User> saveAll(Users users);

	
	//void save(Iterable<S> users);
	

}
