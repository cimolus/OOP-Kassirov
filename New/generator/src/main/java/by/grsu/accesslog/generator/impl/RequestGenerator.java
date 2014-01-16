package by.grsu.accesslog.generator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IRequestGenerator;
import by.grsu.accesslog.generator.IRequestHttpMethodGenerator;
import by.grsu.accesslog.generator.IRequestUrlGenerator;
import by.grsu.accesslog.generator.IRequestVersionGenerator;
import by.grsu.accesslog.model.Request;

@Component
public class RequestGenerator implements IRequestGenerator {
	
	private IRequestHttpMethodGenerator requestHttpMethodGenerator;
	private IRequestUrlGenerator requestUrlGenerator;
	private IRequestVersionGenerator requestVersionGenerator;
	
	@Autowired
	public void setRequestHttpMethodGenerator(
			RequestHttpMethodGenerator requestHttpMethodGenerator) {
		this.requestHttpMethodGenerator = requestHttpMethodGenerator;
	}

	@Autowired
	public void setRequestUrlGenerator(IRequestUrlGenerator requestUrlGenerator) {
		this.requestUrlGenerator = requestUrlGenerator;
	}

	@Autowired
	public void setRequestVersionGenerator(
			IRequestVersionGenerator requestVersionGenerator) {
		this.requestVersionGenerator = requestVersionGenerator;
	}



	public Request generate() {
		return new Request(requestHttpMethodGenerator.generate(),
				requestUrlGenerator.generate(), requestVersionGenerator.generate());
	}

}
