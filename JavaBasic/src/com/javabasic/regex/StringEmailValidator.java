package com.javabasic.regex;

public class StringEmailValidator {

	public static void main(String[] args) {

		String email = "abbas@gmail.com";

		if (email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
			System.out.println("Valid Email ID");
		} else {
			System.out.println("Invalid Email");
		}
	}
}
