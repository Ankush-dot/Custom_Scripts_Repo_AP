package com.java_learnings.basic.dateandtime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OthersDateTimeClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(zdt);
		
		OffsetDateTime ofd = OffsetDateTime.now();
		System.out.println(ofd.getDayOfYear());
		
		Period p = Period.of(2, 9, 12);
		System.out.println(p.addTo(LocalDate.now()));
		
		Instant i = Instant.now();
		System.out.println(i);
		
		
	}

}
