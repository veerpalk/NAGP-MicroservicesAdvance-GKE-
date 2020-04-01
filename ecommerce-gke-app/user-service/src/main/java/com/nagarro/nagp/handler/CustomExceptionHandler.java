package com.nagarro.nagp.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nagarro.nagp.exceptions.DataNotFoundException;
import com.nagarro.nagp.response.ErrorResponse;

@ControllerAdvice
public class CustomExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleInvalidInputException(DataNotFoundException e) {
		logger.warn("Exception occurred", e);
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,
				400, e.getMessage());
		return ResponseEntity.status(errorResponse.getHttpStatus()).body(errorResponse);
	}
}
