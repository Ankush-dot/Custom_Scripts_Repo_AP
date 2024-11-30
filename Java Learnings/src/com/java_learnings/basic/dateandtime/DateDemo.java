package com.java_learnings.basic.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date d = new Date();
//		System.out.println(d);
		
		LocalDate ld = LocalDate.parse("2020-02-03");
		LocalDate ld1=  ld.plusMonths(12);
		System.out.println(ld1);
		
		System.out.println("*****************");
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalTime lt1 = lt.minusMinutes(4556);
		System.out.println(lt1);

		System.out.println("*****************");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String zid = ZoneId.systemDefault().getId();
		ZonedDateTime ldt1=  ldt.atZone(ZoneId.systemDefault());
		System.out.println(ldt1);
	}

}
