package com.kassirov.generators;

import com.kassirov.models.Response;

public class ResponseGenerator {
	
	private ResponseHttpStatusGenerator responseHttpStatusGenerator = new ResponseHttpStatusGenerator();
	private ResponseSizeGenerator responseSizeGenerator = new ResponseSizeGenerator();
	
	public Response generate() {
		return new Response(responseHttpStatusGenerator.generate(), responseSizeGenerator.generate());
	}
	
}
