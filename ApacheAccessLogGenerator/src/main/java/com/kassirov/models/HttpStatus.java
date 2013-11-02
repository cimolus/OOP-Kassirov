package com.kassirov.models;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class HttpStatus {
	private int code;
	private String clarification;
	
	public HttpStatus(int code, String clarification) {
		this.code = code;
		this.clarification = clarification;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getClarification() {
		return clarification;
	}

	public void setClarification(String clarification) {
		this.clarification = clarification;
	}
	
	
}
