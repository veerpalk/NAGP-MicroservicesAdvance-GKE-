package com.nagarro.nagp.restclients;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.nagarro.nagp.entity.Order;

@Component
public class OrderRestClient {

	private Logger logger = LoggerFactory.getLogger(OrderRestClient.class);

	@Autowired
	private RestTemplate restTemplate;

	@Value("${order.service.url}")
	public  String orderServiceUrl;

	public List<Order> getUserOrder(Integer userId) {
		logger.info("calling order rest client with url"+ orderServiceUrl+"/order/"+ userId);	

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(orderServiceUrl+"/order/"+ userId);
		ResponseEntity<Order[]> response = restTemplate.exchange(builder.buildAndExpand().toUri(), HttpMethod.GET, null,
				Order[].class);

		return toList(response.getBody());

	}

	private <T> List<T> toList(T[] array) {
		return Arrays.asList(array);
	}

}
