package com.kassirov.writers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.kassirov.converters.LogConverter;
import com.kassirov.models.Log;

public class TxtFileWriter implements IWriter {
	
	private File file = new File("/access.log");
	
	LogConverter logConverter = new LogConverter();
	
	public void write(List<Log> logs) {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			for( Log log:logs ) {
				bw.append(logConverter.convertToString(log));
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {}
	}

	public void write(Log log) {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append(logConverter.convertToString(log));
			bw.newLine();
			bw.close();
		} catch (IOException e) {}
	}


}
