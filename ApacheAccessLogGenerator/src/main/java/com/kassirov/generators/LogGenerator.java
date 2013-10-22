package com.kassirov.generators;

import com.kassirov.models.Log;

public class LogGenerator {
	
	private Log log;
	
	private IpAddressGenerator ipAddressGenerator = new IpAddressGenerator();
	
	private DateGenerator dateGenerator = new DateGenerator();
	
	private RequestGenerator requestGenerator = new RequestGenerator();
	
	private HttpStatusGenerator httpStatusGenerator = new HttpStatusGenerator();
	
	private ByteGenerator byteGenerator = new ByteGenerator();
	
	public Log generate() {
		log = new Log();
		log.setIpAddress(ipAddressGenerator.generate());
		log.setDate(dateGenerator.generate());
		log.setRequest(requestGenerator.generate());
		log.setHttpStatus(httpStatusGenerator.generate());
		log.setBytes(byteGenerator.generate());
		return log;
	}

}

