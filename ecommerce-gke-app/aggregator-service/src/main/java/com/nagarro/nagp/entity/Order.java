package com.nagarro.nagp.entity;

import java.time.LocalDate;

public class Order {
	private String orderId;
	private String userId;
	private Double orderAmount;
	private LocalDate createdDate;

	public Order() {
	
	}

	public Order(String orderId, String userId, Double orderAmount, LocalDate createdDate) {
		this.orderId = orderId;
		this.userId = userId;
		this.orderAmount = orderAmount;
		this.createdDate = createdDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	
	

}
