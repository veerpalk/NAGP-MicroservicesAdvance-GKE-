package com.nagarro.nagp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
	@JsonIgnore
	private Integer id;
	private String name;
	private Integer age;
	private String email;
	
	public User() {
	}
	public User(Integer id, String name, Integer age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	

}
