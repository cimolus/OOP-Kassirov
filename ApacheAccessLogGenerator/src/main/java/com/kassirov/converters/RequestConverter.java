package com.kassirov.converters;

import com.kassirov.models.Request;

public class RequestConverter {

	public String convertToString(Object object) {
		Request reqeust = (Request) object;
		return "\"" + reqeust.getRequestType() + "/" + reqeust.getRequestContent() + "/"
				+ reqeust.getVersion() + "." + reqeust.getSubversion() + "\"";
	}

}
