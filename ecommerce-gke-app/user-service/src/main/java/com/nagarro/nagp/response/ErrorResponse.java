package com.nagarro.nagp.response;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	
	 	private HttpStatus httpStatus;
	    private int status;
		private String message;

	    public ErrorResponse(HttpStatus httpStatus, int status, String message) {
			super();
			this.httpStatus = httpStatus;
			this.status = status;
			this.message = message;
		}

		public HttpStatus getHttpStatus() {
			return httpStatus;
		}

		public void setHttpStatus(HttpStatus httpStatus) {
			this.httpStatus = httpStatus;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

}
