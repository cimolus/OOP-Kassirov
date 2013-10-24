package com.kassirov.models;

import java.util.Calendar;

public class Date {
	private int day;
	private String month;
	private int year;
	private int hours;
	private int minits;
	private int seconds;
	
	private Calendar calendar = Calendar.getInstance();
	
	public Date(byte day, String month , int year, byte hours, byte minits, byte seconds) {
		this.day = day;
		this.month = String.valueOf(month);
		this.year = year;
		this.hours = hours;
		this.minits = minits;
		this.seconds = seconds;
	}
	
	public Date(java.util.Date date) {
		calendar.setTime(date);
		this.seconds = calendar.get(calendar.SECOND);
		this.minits = calendar.get(calendar.MINUTE);
		this.hours = calendar.get(calendar.HOUR);
		this.year = calendar.get(calendar.YEAR);
		this.month = getMonthFromInt(calendar.get(calendar.MONTH));
		this.day = calendar.get(calendar.DAY_OF_MONTH);
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(byte day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(byte hours) {
		this.hours = hours;
	}

	public int getMinits() {
		return minits;
	}

	public void setMinits(byte minits) {
		this.minits = minits;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(byte seconds) {
		this.seconds = seconds;
	}
	
	private static String getMonthFromInt(int month) {
		switch(month) {
			case 0: return "JUNUARY";
			case 1: return "FEBRUARY";
			case 2: return "MARCH";
			case 3: return "APRIL";
			case 4: return "MAY";
			case 5: return "JUNE";
			case 6: return "JULY";
			case 7: return "AUGUST";
			case 8: return "SEPTEMBER";
			case 9: return "OCTOBER";
			case 10: return "NOVEMBER";
			case 11: return "DECEMBER";
		}
		return null;
	}
	
	
	
}
