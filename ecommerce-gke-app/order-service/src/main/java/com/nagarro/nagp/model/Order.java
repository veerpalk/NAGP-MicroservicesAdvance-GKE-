package com.nagarro.nagp.model;

import java.time.LocalDate;

public class Order {

	private String orderId;
	private Integer userId;
	private Double orderAmount;
	private LocalDate createdDate;

	public Order(String orderId, Integer userId, Double orderAmount, LocalDate createdDate) {
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
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
