package by.grsu.accesslog.generator.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IRequestVersionGenerator;
import by.grsu.accesslog.model.RequestVersion;

@Component
public class RequestVersionGenerator implements IRequestVersionGenerator {
	
	@Autowired
	private Random random;
	
	private String[] protocols = {"HTTP","HTTPS"};
	
	public RequestVersion generate() {
		return new RequestVersion(random.nextInt(2),protocols[random.nextInt(protocols.length)]);
	}
	
}
