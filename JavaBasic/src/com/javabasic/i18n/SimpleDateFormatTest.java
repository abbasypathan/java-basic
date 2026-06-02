package com.javabasic.i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		String format = simpleDateFormat.format(new Date());
		System.out.println(format);
		
		String string = "10-12-2014";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy");
		Date date = dateFormat.parse(string);
		System.out.println(date);
	}
}
