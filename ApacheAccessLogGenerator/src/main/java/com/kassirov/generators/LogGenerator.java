package com.kassirov.generators;

import com.kassirov.models.Log;

public class LogGenerator {
	
	private IPGenerator iPGenerator = new IPGenerator();
	
	private DateGenerator dateGenerator = new DateGenerator();
	
	private RequestGenerator requestGenerator = new RequestGenerator();
	
	private ResponseGenerator responseGenerator = new ResponseGenerator();
	
	public Log generate() {
		return new Log(iPGenerator.generate(),
				dateGenerator.generate(),
				requestGenerator.generate(),
				responseGenerator.generate());
	}

}

