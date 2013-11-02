package com.kassirov.converters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kassirov.models.Log;

public class LogConverter{
	
	IpAddressConverter ipAddressConverter = new IpAddressConverter();
	
	DateConverter dateConverter = new DateConverter();
	
	RequestConverter requestConverter = new RequestConverter();
	
	HttpStatusConverter httpStatusConverter = new HttpStatusConverter();
	
	SizeConverter sizeConverter = new SizeConverter();
	
	public LogConverter() {

	}

	public String convertToString(Log log) {
		StringBuilder sb = new StringBuilder();
		sb.append(ipAddressConverter.convertToString(log.getIpAddress()));
		sb.append(" ");
		sb.append(dateConverter.convertToString(log.getDate()));
		sb.append(" ");
		sb.append(requestConverter.convertToString(log.getRequest()));
		sb.append(" ");
		sb.append(httpStatusConverter.convertToString(log.getHttpStatus()));
		sb.append(" ");
		sb.append(sizeConverter.convertToString(log.getSize()));
		return sb.toString();
	}
	
}
