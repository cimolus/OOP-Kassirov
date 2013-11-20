package com.kassirov.generators;

import java.util.ArrayList;
import java.util.List;

import com.kassirov.converters.LogConverter;
import com.kassirov.models.Log;
import com.kassirov.writers.IWriter;

public class ApacheAccessLogFileGenerator {
	
	private IWriter writer;
	
	private LogGenerator logGenerator = new LogGenerator();
	
	private LogConverter logConverter = new LogConverter();
	
	private List<Log> logs = new ArrayList<Log>();
	
	
	public void setWriter(IWriter writer) {
		this.writer = writer;
	}
	
	public void generate(int count) {
		for( int i = 0; i < count; i++ ) {
			Log log = logGenerator.generate();
			logs.add(log);
			System.out.println(logConverter.convertToString(log));
		}
		writer.write(logs);
	}
	
	
}
