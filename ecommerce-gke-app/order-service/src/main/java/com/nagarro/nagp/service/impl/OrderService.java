package com.nagarro.nagp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.exceptions.DataNotFoundException;
import com.nagarro.nagp.model.Order;
import com.nagarro.nagp.repo.OrderRepo;
import com.nagarro.nagp.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private OrderRepo orderRepo;

	@Override
	public List<Order> getOrderByUserId(Integer userId) {
		List<Order> orderList = orderRepo.getOrderByUserId(userId);
		if(orderList.isEmpty())
			throw new DataNotFoundException("No Order Found");
		return orderList;
	}

	@Override
	public List<Order> getAllOrders() {
		List<Order> orderList = orderRepo.getAllOrders();
		if(orderList.isEmpty())
			throw new DataNotFoundException("No Order Found");
		return orderList;
	}
	
	
}
