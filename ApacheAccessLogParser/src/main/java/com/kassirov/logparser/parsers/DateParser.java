package com.kassirov.logparser.parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.kassirov.models.Date;

public class DateParser {
	
	public Date parse(String node) {
		java.util.Date date = null;
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");
			date = format.parse(node);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date(date);
	}
	
}
