package com.kassirov.writers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.kassirov.models.Log;

public class TxtFileWriter implements IWriter {
	
	private File file = new File("/access.log");
	
	public TxtFileWriter() {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			//FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			//BufferedWriter bw = new BufferedWriter(fw);
		}catch(IOException e) {}
	}
	
	public void write(List<Log> logs) {
		
	}

	public void write(Log log) {
		
	}

	public void write(String string) {
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append(string);
			bw.newLine();
			bw.close();
		} catch (IOException e) {}
	}

}
