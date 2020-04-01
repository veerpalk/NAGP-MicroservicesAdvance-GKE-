package com.nagarro.nagp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.exceptions.DataNotFoundException;
import com.nagarro.nagp.model.User;
import com.nagarro.nagp.repository.UserRepo;
import com.nagarro.nagp.repository.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User getUser(String id) {

		User user = userRepo.getUserById(id);
		if(user== null)
			throw new DataNotFoundException("User Not Found");
		return user;		
	}

}
