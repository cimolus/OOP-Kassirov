package by.grsu.accesslog.generator.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IResponseHttpStatusGenerator;
import by.grsu.accesslog.model.ResponseHttpStatus;

@Component
public class ResponseHttpStatusGenerator implements IResponseHttpStatusGenerator {
	
	@Autowired
	private Random random;
	
	int [] codearray = new int[] {
		102,200, 401,507,404
	};
	
	public ResponseHttpStatus generate() {
		int code = codearray[random.nextInt(5)];
		return new ResponseHttpStatus(code);
	}
}
