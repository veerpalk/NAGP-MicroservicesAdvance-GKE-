package com.nagarro.nagp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.model.Order;
import com.nagarro.nagp.service.IOrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private IOrderService orderService;
	
	@GetMapping("/{id}")
	public List<Order> getOrder(@PathVariable("id") Integer userId) {
		logger.info("getting order from OrderService of user "+userId);
		return orderService.getOrderByUserId(userId);
	}

	@GetMapping("/all")
	public List<Order> getAllOrders() {
		logger.info("getting all orders from OrderService");
		return orderService.getAllOrders();
	}

}
