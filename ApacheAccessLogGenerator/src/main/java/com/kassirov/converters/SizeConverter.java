package com.kassirov.converters;

import com.kassirov.models.Size;

public class SizeConverter{


	public String convertToString(Size size) {
		return  "\"" + size.getSize() + "\"";
	}

}
