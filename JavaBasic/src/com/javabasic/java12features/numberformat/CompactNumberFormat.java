package com.javabasic.java12features.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));// 1k
		System.out.println(format.format(10000));// 10k

		format = NumberFormat.getCompactNumberInstance(Locale.UK, NumberFormat.Style.LONG);
		System.out.println(format.format(1000));// 1 thousand
		System.out.println(format.format(10000));// 10 thousand

		format = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.LONG);
		System.out.println(format.format(1000));// 1,000
		System.out.println(format.format(10000));// 1万
	}
}
