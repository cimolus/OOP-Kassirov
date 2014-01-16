package by.grsu.accesslog.generator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IDateGenerator;
import by.grsu.accesslog.generator.IIPGenerator;
import by.grsu.accesslog.generator.ILogGenerator;
import by.grsu.accesslog.generator.IRequestGenerator;
import by.grsu.accesslog.generator.IResponseGenerator;
import by.grsu.accesslog.model.Log;

@Component
public class LogGenerator implements ILogGenerator {
	
	private IIPGenerator iPGenerator;
	
	private IDateGenerator dateGenerator;
	
	private IRequestGenerator requestGenerator;
	
	private IResponseGenerator responseGenerator;
	
	@Autowired
	public void setIPGenerator(IIPGenerator iPGenerator) {
		this.iPGenerator = iPGenerator;
	}
	
	@Autowired
	public void setDateGenerator(IDateGenerator dateGenerator) {
		this.dateGenerator = dateGenerator;
	}
	
	@Autowired
	public void setRequestGenerator(IRequestGenerator requestGenerator) {
		this.requestGenerator = requestGenerator;
	}
	
	@Autowired
	public void setResponseGenerator(IResponseGenerator responseGenerator) {
		this.responseGenerator = responseGenerator;
	}

	public Log generate() {
		return new Log(iPGenerator.generate(),
				dateGenerator.generate(),
				requestGenerator.generate(),
				responseGenerator.generate());
	}

}

