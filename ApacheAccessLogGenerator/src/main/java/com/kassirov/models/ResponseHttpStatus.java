package com.kassirov.models;

public class ResponseHttpStatus {
	
	private int code;
	
	public ResponseHttpStatus(int code) {
		this.setCode(code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
