package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.Request;

public class RequestGenerator {

	private Random random = new Random();
	
	public Request generate() {
		String requestType;
		String requestContent;
		if (random.nextInt(2) == 0) {
			requestType = "GET";
		} else requestType = "POST";
		
		if (random.nextInt(2) ==  0) {
			requestContent = "HTTP";
		} else requestContent = "HTTPS";
		return new Request(requestType, requestContent, random.nextInt(2));
	}

}
