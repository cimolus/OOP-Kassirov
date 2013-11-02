package com.kassirov.generators;

import com.kassirov.models.Log;

public class LogGenerator {
	
	private Log log;
	
	private IpAddressGenerator ipAddressGenerator = new IpAddressGenerator();
	
	private DateGenerator dateGenerator = new DateGenerator();
	
	private RequestGenerator requestGenerator = new RequestGenerator();
	
	private HttpStatusGenerator httpStatusGenerator = new HttpStatusGenerator();
	
	private SizeGenerator sizeGenerator = new SizeGenerator();
	
	public Log generate() {
		return new Log(ipAddressGenerator.generate(),
				dateGenerator.generate(),
				requestGenerator.generate(),
				httpStatusGenerator.generate(),
				sizeGenerator.generate());
	}

}

