package com.kassirov.models;

public class Date {
	private byte day;
	private String month;
	private int year;
	private byte hours;
	private byte minits;
	private byte seconds;
	
	public Date(byte day, String month , int year, byte hours, byte minits, byte seconds) {
		this.day = day;
		this.month = String.valueOf(month);
		this.year = year;
		this.hours = hours;
		this.minits = minits;
		this.seconds = seconds;
	}

	public byte getDay() {
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

	public byte getHours() {
		return hours;
	}

	public void setHours(byte hours) {
		this.hours = hours;
	}

	public byte getMinits() {
		return minits;
	}

	public void setMinits(byte minits) {
		this.minits = minits;
	}

	public byte getSeconds() {
		return seconds;
	}

	public void setSeconds(byte seconds) {
		this.seconds = seconds;
	}
	
	
	
	
	
}
