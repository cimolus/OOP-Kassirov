package com.kassirov.models;

public class Response {
	
	private ResponseHttpStatus responseHttpStatus;
	
	private ResponseSize responseSize;
	
	public Response(ResponseHttpStatus responseHttpStatus, ResponseSize responseSize) {
		this.setResponseHttpStatus(responseHttpStatus);
		this.setResponseSize(responseSize);
	}

	public ResponseHttpStatus getResponseHttpStatus() {
		return responseHttpStatus;
	}

	public void setResponseHttpStatus(ResponseHttpStatus responseHttpStatus) {
		this.responseHttpStatus = responseHttpStatus;
	}

	public ResponseSize getResponseSize() {
		return responseSize;
	}

	public void setResponseSize(ResponseSize responseSize) {
		this.responseSize = responseSize;
	}
	
	
}
