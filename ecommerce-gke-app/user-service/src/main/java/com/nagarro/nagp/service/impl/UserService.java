package com.nagarro.nagp.service.impl;

import org.hibernate.exception.DataException;
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
	public User getUser(Integer id) {

		User user = userRepo.findById(id).get();
		if (user == null)
			throw new DataNotFoundException("User Not Found");
		return user;
	}

	public void addUser(User userRequest) {
		User user = userRepo.save(userRequest);
		if (user == null)
			throw new DataNotFoundException("User creation failed");

	}

}
