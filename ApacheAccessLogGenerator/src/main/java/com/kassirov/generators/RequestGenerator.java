package com.kassirov.generators;

import com.kassirov.models.Request;

public class RequestGenerator {
	
	private RequestHttpMethodGenerator requestHttpMethodGenerator = new RequestHttpMethodGenerator();
	private RequestUrlGenerator requestUrlGenerator = new RequestUrlGenerator();
	private RequestVersionGenerator requestVersionGenerator = new RequestVersionGenerator();
	
	public Request generate() {
		return new Request(requestHttpMethodGenerator.generate(),
				requestUrlGenerator.generate(), requestVersionGenerator.generate());
	}

}
