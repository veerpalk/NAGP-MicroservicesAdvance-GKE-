package com.nagarro.nagp.repository.service;

import com.nagarro.nagp.model.User;

public interface IUserService {
	
	User getUser(Integer id);
    void addUser(User userRequest);

}