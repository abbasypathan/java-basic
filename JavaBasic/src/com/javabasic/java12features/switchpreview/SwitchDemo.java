package com.javabasic.java12features.switchpreview;

public class SwitchDemo {

	public static void main(String[] args) {

		//previously
		int key = 3;
		switch (key) {
		case 1: {
			System.out.println("Case1");
			break;
		}
		case 2: {
			System.out.println("Case2");
			break;
		}
		case 3: {
			System.out.println("Case3");
			break;
		}
		default: {
			System.out.println("Default");
		}
		}

		//After java 12
		String result = switch (key) {
		case 1 -> {
			System.out.println("Case1");
			yield "Monday";
		}
		case 2 -> {
			System.out.println("Case2");
			yield "Tuesday";
		}
		case 3 -> {
			System.out.println("Case3");
			yield "Wednesday";
		}
		default -> {
			yield "Other";
		}
		};
		System.out.println(result);
	}
}
