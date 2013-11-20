package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.ResponseHttpStatus;

public class ResponseHttpStatusGenerator {
	
	private Random random = new Random();
	
	int [] codearray = new int[] {
		102,200, 401,507,404
	};
	
	public ResponseHttpStatus generate() {
		int code = codearray[random.nextInt(5)];
		return new ResponseHttpStatus(code);
	}
}
