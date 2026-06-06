package com.javabasic.java16features.datetimeformat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.parse("10:23:23.9576");
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h B");
		System.out.println(ofPattern.format(localTime));//10 in the morning
	}
}
