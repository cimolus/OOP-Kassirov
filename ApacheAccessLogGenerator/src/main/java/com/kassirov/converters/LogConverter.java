package com.kassirov.converters;

import com.kassirov.models.Log;

public class LogConverter{
	
	private IPConverter ipConverter = new IPConverter();
	
	private DateConverter dateConverter = new DateConverter();
	
	private RequestConverter requestConverter = new RequestConverter();
	
	private ResponseConverter responseConverter = new ResponseConverter();

	public String convertToString(Log log) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(ipConverter.convertToString(log.getIp()));
		sb.append("--");
		sb.append("[");
		sb.append(dateConverter.convertToString(log.getDate()));
		sb.append("] ");
		sb.append("\"");
		sb.append(requestConverter.convertToString(log.getRequest()));
		sb.append("\"");
		sb.append(" ");
		sb.append(responseConverter.convertToString(log.getResponse()));
		
		return sb.toString();
	}
	
}
