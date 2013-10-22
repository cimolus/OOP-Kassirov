package com.kassirov.app;

import com.kassirov.generators.ApacheAccessLogFileGenerator;

public class App {

	public static void main(String[] args) {
		ApacheAccessLogFileGenerator apacheAccessLogFileGenerator = new ApacheAccessLogFileGenerator();
		apacheAccessLogFileGenerator.generate(1000);
	}

}
