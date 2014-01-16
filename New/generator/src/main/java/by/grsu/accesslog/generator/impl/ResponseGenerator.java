package by.grsu.accesslog.generator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IResponseGenerator;
import by.grsu.accesslog.generator.IResponseHttpStatusGenerator;
import by.grsu.accesslog.generator.IResponseSizeGenerator;
import by.grsu.accesslog.model.Response;

@Component
public class ResponseGenerator implements IResponseGenerator {
	
	private IResponseHttpStatusGenerator responseHttpStatusGenerator;
	private IResponseSizeGenerator responseSizeGenerator;
	
	@Autowired
	public void setResponseHttpStatusGenerator(
			IResponseHttpStatusGenerator responseHttpStatusGenerator) {
		this.responseHttpStatusGenerator = responseHttpStatusGenerator;
	}
	
	@Autowired
	public void setResponseSizeGenerator(IResponseSizeGenerator responseSizeGenerator) {
		this.responseSizeGenerator = responseSizeGenerator;
	}

	public Response generate() {
		return new Response(responseHttpStatusGenerator.generate(), responseSizeGenerator.generate());
	}
	
}
