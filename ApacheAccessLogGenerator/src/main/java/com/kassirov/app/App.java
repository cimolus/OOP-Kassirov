package com.kassirov.app;

import com.kassirov.generators.ApacheAccessLogFileGenerator;
import com.kassirov.writers.TxtFileWriter;

public class App {

	public static void main(String[] args) {
		ApacheAccessLogFileGenerator apacheAccessLogFileGenerator = new ApacheAccessLogFileGenerator();
		apacheAccessLogFileGenerator.setWriter(new TxtFileWriter());
		apacheAccessLogFileGenerator.generate(1000);
	}

}
