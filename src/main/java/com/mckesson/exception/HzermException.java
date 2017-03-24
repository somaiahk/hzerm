package com.mckesson.exception;

public class HzermException  extends RuntimeException {
	
	private String errorMsg;
	private String status;
	private int statusCode;
	
	public HzermException() {		
	}
	
	public HzermException(String errorMsg, String status, int code) {
		super(String.format("Error occured due to %s and status as %s and status code is %s", errorMsg, status, code));
	}

}
