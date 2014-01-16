package by.grsu.accesslog.generator.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IDateGenerator;

@Component
public class DateGenerator implements IDateGenerator {
	
	Date date = new Date();
	
	Calendar cal = Calendar.getInstance();
	
	@Autowired
	Random random;
	
	public DateGenerator() {
		cal.setTime(date);
	}
	
	@SuppressWarnings("static-access")
	public by.grsu.accesslog.model.Date generate() {
		cal.set(Calendar.SECOND, cal.SECOND + random.nextInt(500));
		return new by.grsu.accesslog.model.Date(cal.getTime());
	}
}