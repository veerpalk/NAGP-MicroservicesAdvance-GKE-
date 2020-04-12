package com.nagarro.nagp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.handler.CustomExceptionHandler;
import com.nagarro.nagp.model.User;
import com.nagarro.nagp.service.impl.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Integer id)
	{	logger.info("Getting User with user Id "+id);
		return userService.getUser(id);
	}
	
	@PostMapping
	public void addUser(@RequestBody User userRequest)
	{
		logger.info("Adding User: "+userRequest);
		userService.addUser(userRequest);
		
	}

}
