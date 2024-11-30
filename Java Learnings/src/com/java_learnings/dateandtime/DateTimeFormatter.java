package com.java_learnings.dateandtime;

import java.time.ZonedDateTime;

public class DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * y = year
		 * M = Month
		 * d = day
		 * 
		 * h = Hour (0-12)
		 * H = Hour (0-23)
		 * m = minutes
		 * s = seconds
		 * S = MiliSeconds
		 * z = time Zone
		 * Z = offSet
		 */
		
		ZonedDateTime zdt = ZonedDateTime.now();
		java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
		System.out.println(zdt.format(dtf));
	}

}
