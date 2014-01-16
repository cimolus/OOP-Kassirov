package by.grsu.accesslog.generator.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IRequestHttpMethodGenerator;
import by.grsu.accesslog.model.RequestHttpMethod;


@Component
public class RequestHttpMethodGenerator implements IRequestHttpMethodGenerator{
	
	@Autowired
	private Random random;
	
	private String[] methods = {"GET", "POST"};
	
	public RequestHttpMethod generate() {
		return new RequestHttpMethod(methods[random.nextInt(methods.length)]);
	}
	
}
