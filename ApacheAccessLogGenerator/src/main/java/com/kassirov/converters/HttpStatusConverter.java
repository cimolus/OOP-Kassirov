package com.kassirov.converters;

import com.kassirov.models.HttpStatus;

public class HttpStatusConverter{

	public String convertToString(HttpStatus httpStatus) {
		return httpStatus.getCode() + " " + httpStatus.getClarification();
	}

}
