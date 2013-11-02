package com.kassirov.models;


public class Log {
	private IpAddress ipAddress;
	private Date date;
	private Request request;
	private HttpStatus httpStatus;
	private Size size;
	
	public Log(IpAddress ipAddress,Date date, Request request, HttpStatus httpStatus, Size size) {
		this.ipAddress = ipAddress;
		this.date = date;
		this.request = request;
		this.httpStatus = httpStatus;
		this.size = size;
	}
	
	public IpAddress getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(IpAddress ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Request getRequest() {
		return request;
	}
	
	public void setRequest(Request request) {
		this.request = request;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}	
	
	
	
}
