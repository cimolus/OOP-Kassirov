package com.kassirov.generators;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.kassirov.models.HttpStatus;

public class HttpStatusGenerator {
	
	private Random random = new Random();
	
	private Map<Integer, String> statuses = new HashMap<Integer, String>();;
	
	int [] codearray = new int[] {
		102,200, 401,507,404
	};
	
	public HttpStatusGenerator() {
		statuses.put(102, "Processing");
		statuses.put(200, "Webpage Created");
		statuses.put(401,"Access allowed only for registered users");
		statuses.put(507, "Insufficient Storage");
		statuses.put(404, "Not Found");
	}
	
	
	public HttpStatus generate() {
		int code = codearray[random.nextInt(5)];
		return new HttpStatus(code, statuses.get(code));
	}
}
