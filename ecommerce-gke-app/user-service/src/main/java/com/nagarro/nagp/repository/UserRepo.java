package com.nagarro.nagp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nagarro.nagp.model.User;

@Repository
public class UserRepo {

	List<User> users = new ArrayList<User>() {
		{
			add(new User("1", "Veerpal Kaur", 23, "veerpal.kaur@nagarro.com"));
			add(new User("2", "gunnu", 24, "gunnu.gmail.com"));
			add(new User("3", "davy", 24, "davy.gmail.com"));
			add(new User("4", "kiran", 24, "kiran.gmail.com"));
		}
	};

	public void addUser(User usr) {
		this.users.add(usr);
	}

	public List<User> getAllUsers() {

		return this.users;

	}

	public User getUserById(String id) {

		for (User user : this.users) {
			if (user.getId().equals(id))
				return user;
		}
		return null;
	}

	public User getUserByName(String name) {

		for (User user : this.users) {
			if (user.getName().equals(name))
				return user;
		}
		return null;
	}

	public User findByEmail(String email) {
		for (User user : this.users) {
			if (user.getEmail().equals(email))
				return user;
		}
		return null;
	}

	public void updateUser(User updateUser) {
		this.users.removeIf(user -> user.getId().equals(updateUser.getId()));
		this.users.add(updateUser);
	}

	public void deleteUser(String id) {
		this.users.removeIf(user -> user.getId().equals(id));
	}

}
