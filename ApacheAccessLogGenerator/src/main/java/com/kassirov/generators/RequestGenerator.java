package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.Request;

public class RequestGenerator {
	
	private Request request;
	
	private Random random = new Random();
	
	public Request generate() {
		request = new Request();
		if (random.nextInt(2) == 0) {
			request.setRequestType("GET");
		} else request.setRequestType("POST");
		
		if (random.nextInt(2) ==  0) {
			request.setRequestContent("HTTP");
		} else request.setRequestContent("HTTPS");
		return request;
	}

}
