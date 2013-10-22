package com.kassirov.models;

import java.util.HashMap;
import java.util.Map;

public class CurrentDate {
	private static byte day = 1;
	private static int month = 10;
	private static int year = 2013;
	
	private static byte hours = 0;
	private static byte minits = 0;
	private static byte seconds = 0;
	
	private static Map<Integer,String> months = new HashMap<Integer, String>();
	static {
		months.put( 1, "Junuary");
		months.put( 2, "February");
		months.put( 3, "March");
		months.put( 4, "April");
		months.put( 5, "May");
		months.put( 6, "June");
		months.put( 7, "July");
		months.put( 8, "August");
		months.put( 9, "September");
		months.put( 10, "October");
		months.put( 11, "November");
		months.put( 12, "December");
	}
	
	public static Date getDate() {
		generateDate();
		return new Date(day,months.get(month),year,hours,minits,seconds);
	}
	
	private static void generateDate() {
		seconds += 20;
		if ( seconds >= 60 ) {
			seconds = 0;
			minits++;
		} else if ( minits >= 60 ) {
			minits = 0;
			hours++;
		} else if ( hours >= 24 ) {
			hours = 0;
			day++;
		} else if ( day >= 30 ) {
			day = 1;
			month++;
		} else if ( month > 12 ) {
			month = 1;
			year++;
		}
	}
	
	
}
