package com.javabasic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher matcher = pattern.matcher("9096969798");
		if (matcher.matches()) {
			System.out.println("Valid Mobile No");
		} else {
			System.out.println("Invalid Mobile No");
		}
	}
}
