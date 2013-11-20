package com.kassirov.converters;

import com.kassirov.models.Request;

public class RequestConverter {

	public String convertToString(Request request) {
		StringBuilder sb = new StringBuilder();
		sb.append(request.getRequestHttpMethod().getRequestMethod());
		sb.append(" ");
		sb.append(request.getRequestUrl().getUrl());
		sb.append(" ");
		sb.append(request.getRequestVersion().getRequestProtocol());
		sb.append("/");
		sb.append(request.getRequestVersion().getVersion());
		sb.append(".");
		sb.append(request.getRequestVersion().getSubversion());
		return sb.toString();
	}

}
