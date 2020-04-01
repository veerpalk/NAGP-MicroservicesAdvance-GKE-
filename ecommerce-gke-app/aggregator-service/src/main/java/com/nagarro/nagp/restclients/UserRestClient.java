package com.nagarro.nagp.restclients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.nagarro.nagp.entity.User;

@Component
public class UserRestClient {
	
	
	private Logger logger = LoggerFactory.getLogger(UserRestClient.class);

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${user.service.url}")
	public  String userServiceUrl;
	

	public User getUser(String userId) {
		
		logger.info("calling user resl client with url"+ userServiceUrl+"/user/"+userId);	
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(userServiceUrl+"/user/"+userId);
		ResponseEntity<User> response = restTemplate.exchange(builder.buildAndExpand().toUri(), HttpMethod.GET,
				null,User.class);
		
		return response.getBody();
	}


}
