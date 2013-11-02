package com.kassirov.models;

import java.util.Calendar;

public class Date {
	private int day;
	private int month;
	private int year;
	private int hours;
	private int minits;
	private int seconds;
	
	private Calendar calendar = Calendar.getInstance();
	
	public Date(byte day, int month , int year, byte hours, byte minits, byte seconds) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minits = minits;
		this.seconds = seconds;
	}
	
	@SuppressWarnings("static-access")
	public Date(java.util.Date date) {
		calendar.setTime(date);
		this.seconds = calendar.get(calendar.SECOND);
		this.minits = calendar.get(calendar.MINUTE);
		this.hours = calendar.get(calendar.HOUR);
		this.year = calendar.get(calendar.YEAR);
		this.month = calendar.get(calendar.MONTH) + 1;
		this.day = calendar.get(calendar.DAY_OF_MONTH);
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(byte day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
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
	
}
