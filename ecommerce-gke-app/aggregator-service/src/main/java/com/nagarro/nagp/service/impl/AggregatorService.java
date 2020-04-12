package com.nagarro.nagp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.entity.OrderDetailsDto;
import com.nagarro.nagp.restclients.OrderRestClient;
import com.nagarro.nagp.restclients.UserRestClient;
import com.nagarro.nagp.service.IAggregatorService;

@Service
public class AggregatorService implements IAggregatorService {

	@Autowired
	private UserRestClient userClient;
	
	@Autowired
	private OrderRestClient orderClient;
	
	@Override
	public OrderDetailsDto getOrderDetails(Integer userId) {
		
		OrderDetailsDto orderDetailDto = new OrderDetailsDto();
		orderDetailDto.setUser(userClient.getUser(userId));
		orderDetailDto.setOrders(orderClient.getUserOrder(userId));
		
		return orderDetailDto;
	}
	

}
