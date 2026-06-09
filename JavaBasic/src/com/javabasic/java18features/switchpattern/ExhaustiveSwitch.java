package com.javabasic.java18features.switchpattern;

public class ExhaustiveSwitch {

	public static String format(Object obj) {
		// It will give compile error if we don't specify default case
		return switch (obj) {
		case String s -> "String" + s;
		default -> "xyz";
		};
	}

	public static void main(String[] args) {
		System.out.println(ExhaustiveSwitch.format("abc"));
	}
}
