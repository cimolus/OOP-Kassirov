package by.grsu.accesslog.generator.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IResponseSizeGenerator;
import by.grsu.accesslog.model.ResponseSize;

@Component
public class ResponseSizeGenerator implements IResponseSizeGenerator {
	
	@Autowired
	private Random random;
	
	public ResponseSize generate() {
		return new ResponseSize(random.nextInt(3000));
	}
}
