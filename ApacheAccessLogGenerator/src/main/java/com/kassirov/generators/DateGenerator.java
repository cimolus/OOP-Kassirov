package com.kassirov.generators;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateGenerator {
	
	Date date = new Date();
	
	Calendar cal = Calendar.getInstance();
	
	Random random = new Random();
	
	public DateGenerator() {
		cal.setTime(date);
	}
	
	@SuppressWarnings("static-access")
	public com.kassirov.models.Date generate() {
		cal.set(Calendar.SECOND, cal.SECOND + random.nextInt(500));
		return new com.kassirov.models.Date(cal.getTime());
	}
}
