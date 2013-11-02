package com.kassirov.converters;

import com.kassirov.models.Request;

public class RequestConverter {

	public String convertToString(Request request) {
		return "\"" + request.getRequestType() + "/" + request.getRequestContent() + "/"
				+ request.getVersion() + "." + request.getSubversion() + "\"";
	}

}
