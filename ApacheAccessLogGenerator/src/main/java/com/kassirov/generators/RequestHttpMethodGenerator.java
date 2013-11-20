package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.RequestHttpMethod;

public class RequestHttpMethodGenerator {
	
	private Random random = new Random();
	
	private String[] methods = {"GET", "POST"};
	
	public RequestHttpMethod generate() {
		return new RequestHttpMethod(methods[random.nextInt(methods.length)]);
	}
	
}
