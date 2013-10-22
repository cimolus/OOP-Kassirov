package com.kassirov.writers;

import java.util.List;

import com.kassirov.models.Log;

public interface IWriter {
	public void write(List<Log> logs);
	public void write(Log log);
	public void write(String string);
}
