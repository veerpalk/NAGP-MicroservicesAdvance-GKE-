package com.nagarro.nagp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.entity.OrderDetailsDto;
import com.nagarro.nagp.service.IAggregatorService;


@RestController
public class AggregatorController {
	
	
	private Logger logger = LoggerFactory.getLogger(AggregatorController.class);
	private static final String WELCOME_MSG = "Welcome! to order-details service.";

	@Autowired
	private IAggregatorService aggregatorService;
	
	@GetMapping("orderdetails")
	public String greet()
	{
		return WELCOME_MSG;
		
	}
	
	@GetMapping("orderdetails/{id}")
	public OrderDetailsDto getOrderDetails(@PathVariable("id") String userId) {
		logger.info("Entered OrderDetails method of Aggregator Controller");
		 return aggregatorService.getOrderDetails(userId);
	}

}
