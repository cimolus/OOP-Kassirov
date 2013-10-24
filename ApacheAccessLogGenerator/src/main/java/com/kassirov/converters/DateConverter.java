package com.kassirov.converters;

import com.kassirov.models.Date;

public class DateConverter{


	public String convertToString(Object object) {
		Date date = (Date) object;
		return "[" + date.getDay() + "/" + date.getMonth()
				+ "/" + date.getYear() + " " + date.getHours()
				+ ":" + date.getMinits() + ":" + date.getSeconds() +  " 0000]";
	}

}
