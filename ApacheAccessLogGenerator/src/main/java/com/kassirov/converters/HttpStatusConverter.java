package com.kassirov.converters;

import com.kassirov.models.HttpStatus;

public class HttpStatusConverter implements IModelConverter {

	public String convertToString(Object object) {
		HttpStatus httpStatus = (HttpStatus) object;
		return httpStatus.getCode() + " " + httpStatus.getClarification();
	}

}
