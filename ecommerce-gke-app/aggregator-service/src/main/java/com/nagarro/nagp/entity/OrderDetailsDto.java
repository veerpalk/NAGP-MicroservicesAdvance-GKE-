package com.nagarro.nagp.entity;

import java.util.List;

public class OrderDetailsDto {
	
	private User user;
	private List<Order> orders;
	public OrderDetailsDto(User user, List<Order> orders) {
		this.user = user;
		this.orders = orders;
	}
	public OrderDetailsDto() {	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	

}
