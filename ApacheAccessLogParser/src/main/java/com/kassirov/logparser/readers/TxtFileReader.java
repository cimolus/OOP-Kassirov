package com.kassirov.logparser.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtFileReader implements IReader {

	public List<String> readAllStrings() {
		try {
			List<String> strings = new ArrayList<String>();
			BufferedReader br = new BufferedReader(new FileReader("/access.log"));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				strings.add(sCurrentLine);
			}
			return strings;
		} catch (IOException e) {
			e.printStackTrace();
		} 
			
		return null;
	}
	
}
