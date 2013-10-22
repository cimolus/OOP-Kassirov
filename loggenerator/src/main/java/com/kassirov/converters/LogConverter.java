package com.kassirov.converters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kassirov.models.Log;

public class LogConverter implements IModelConverter{
	
	//private List<IModelConverter> converters = new ArrayList<IModelConverter>();
	private Map<String,IModelConverter> converters = new HashMap<String, IModelConverter>();
	
	public LogConverter() {
		converters.put( "IpAddress" , new IpAddressConverter() );
		converters.put( "Date", new DateConverter() );
		converters.put( "Request", new RequestConverter() );
		converters.put( "HttpStatus", new HttpStatusConverter() );
		converters.put( "Byte", new ByteConverter() );
	}

	public String convertToString(Object object) {
		StringBuilder sb = new StringBuilder();
		Log log = (Log) object;
		sb.append(converters.get("IpAddress").convertToString(log.getIpAddress()));
		sb.append(" ");
		sb.append(converters.get("Date").convertToString(log.getDate()));
		sb.append(" ");
		sb.append(converters.get("Request").convertToString(log.getRequest()));
		sb.append(" ");
		sb.append(converters.get("HttpStatus").convertToString(log.getHttpStatus()));
		sb.append(" ");
		sb.append(converters.get("Byte").convertToString(log.getBytes()));
		return sb.toString();
	}
	
}
