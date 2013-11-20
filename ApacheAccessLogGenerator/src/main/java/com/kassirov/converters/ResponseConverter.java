package com.kassirov.converters;

import com.kassirov.models.Response;

public class ResponseConverter {
	
	public String convertToString(Response response) {
		StringBuilder sb = new StringBuilder();
		sb.append("'");
		sb.append(response.getResponseHttpStatus().getCode());
		sb.append(" ");
		sb.append(response.getResponseSize().getSize());
		sb.append("'");
		return sb.toString();
	}
	
}
