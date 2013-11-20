package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.ResponseSize;

public class ResponseSizeGenerator {
	
	private Random random = new Random();
	
	public ResponseSize generate() {
		return new ResponseSize(random.nextInt(3000));
	}
}
