package com.javabasic.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {

		Date date = new Date();
		DateFormat usDate = DateFormat.getDateInstance(0, Locale.US);
		DateFormat ukDate = DateFormat.getDateInstance(0, Locale.UK);

		System.out.println(usDate.format(date));
		System.out.println(ukDate.format(date));

		DateFormat timeInstance = DateFormat.getTimeInstance();
		System.out.println(timeInstance.format(date));

		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(date));
	}
}
