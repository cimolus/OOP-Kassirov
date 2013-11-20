package com.kassirov.converters;

import com.kassirov.models.Date;

public class DateConverter{


	public String convertToString(Date date) {
		StringBuilder sb = new StringBuilder();
		sb.append(date.getDay());
		sb.append("/");
		sb.append(date.getMonth());
		sb.append("/");
		sb.append(date.getYear());
		sb.append(":");
		sb.append(date.getHours());
		sb.append(":");
		sb.append(date.getMinits());
		sb.append(":");
		sb.append(date.getSeconds());
		sb.append(" +");
		sb.append(date.getTimeOffset());
		return sb.toString();
	}

}
