package com.nagarro.nagp.service;

import com.nagarro.nagp.entity.OrderDetailsDto;

public interface IAggregatorService {

	OrderDetailsDto getOrderDetails(String userId);

}