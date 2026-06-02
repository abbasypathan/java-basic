package com.javabasic.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		double d = 23456.4568;
		NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
		format.setMaximumFractionDigits(3);
		String string = format.format(d);
		System.out.println(string);
	}
}
