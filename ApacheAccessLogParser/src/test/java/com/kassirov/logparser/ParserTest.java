package com.kassirov.logparser;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kassirov.converters.LogConverter;
import com.kassirov.generators.LogGenerator;
import com.kassirov.logparser.parsers.LogParser;
import com.kassirov.models.Log;

public class ParserTest {
	
	private LogGenerator logGenerator;
	private LogParser logParser;
	private LogConverter logConverter;
	
	@Before
	public void init() {
		logGenerator = new LogGenerator();
		logParser = new LogParser();
		logConverter = new LogConverter();
	}
	
	@Test
	public void test() {
		Log log = logGenerator.generate();
		String logString = logConverter.convertToString(log);
		Log parseLog = logParser.parse(logString);
		System.out.println(logString);
		System.out.println(logConverter.convertToString(parseLog));
		assertTrue(log.equals(parseLog));
	}
	
	@After
	public void destroy() {
		logGenerator = null;
		logParser = null;
		logConverter = null;
	}

}
