package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.RequestVersion;

public class RequestVersionGenerator {
	
	private Random random = new Random();
	
	private String[] protocols = {"HTTP","HTTPS"};
	
	public RequestVersion generate() {
		return new RequestVersion(random.nextInt(2),protocols[random.nextInt(protocols.length)]);
	}
	
}
