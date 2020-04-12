package com.nagarro.nagp.service;

import java.util.List;

import com.nagarro.nagp.model.Order;

public interface IOrderService {

	List<Order> getOrderByUserId(Integer userId);

	List<Order> getAllOrders();

}