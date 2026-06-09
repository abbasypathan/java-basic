package com.javabasic.java18features.switchpattern;

public class DominanceChecking {

	public static void test(Object obj) {

		switch (obj) {
		// First case is CharSequence which will cover the String as well, due to which
		// String case will be giving error
		case CharSequence cs -> System.out.println(cs);
		// case String s -> System.out.println("String");
		default -> throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		DominanceChecking.test("Abbas");
	}
}
