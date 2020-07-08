package com.task.java.pojo;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private String statusCode="1004-Request";

	
	
	public JwtResponse(String jwttoken,String statusCode) {
		this.jwttoken = jwttoken;
		this.statusCode = statusCode;
	}

	public String getToken() {
		return this.jwttoken;
	}
	
	public String getStatusCode() {
		return this.statusCode;
	}
}