package com.java_learnings.basic.dateandtime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DeprecatedDateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.getYear()+1900);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(2019)); 
		
		//gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz = gc.getTimeZone();
		System.out.println(tz.getDisplayName());
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
	}

}
