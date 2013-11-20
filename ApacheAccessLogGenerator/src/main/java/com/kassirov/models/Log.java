package com.kassirov.models;


public class Log {
	private IP ip;
	private Date date;
	private Request request;
	private Response response;
	
	public Log( IP ip, Date date, Request request, Response response ) {
		this.ip = ip;
		this.date = date;
		this.request = request;
		this.response = response;
	}

	public IP getIp() {
		return ip;
	}

	public void setIp(IP ip) {
		this.ip = ip;
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

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
	
	
	
	
}
