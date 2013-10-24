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
	
	ByteConverter byteConverter = new ByteConverter();
	
	public LogConverter() {

	}

	public String convertToString(Object object) {
		StringBuilder sb = new StringBuilder();
		Log log = (Log) object;
		sb.append(ipAddressConverter.convertToString(log.getIpAddress()));
		sb.append(" ");
		sb.append(dateConverter.convertToString(log.getDate()));
		sb.append(" ");
		sb.append(requestConverter.convertToString(log.getRequest()));
		sb.append(" ");
		sb.append(httpStatusConverter.convertToString(log.getHttpStatus()));
		sb.append(" ");
		sb.append(byteConverter.convertToString(log.getBytes()));
		return sb.toString();
	}
	
}
