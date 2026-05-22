package com.javabasic.java8features.predicate;

import java.util.function.Predicate;

public class PredicateJoinDemo {

	public static void main(String[] args) {
		int[] arr = { 0, 7, 6, 10, 30, 50, 70, 73 };

		System.out.println("Number is greater than 10 :");
		Predicate<Integer> p1 = (value) -> value > 10;
		PredicateAsMethodArgumentDemo.method(p1, arr);

		System.out.println("Number even :");
		Predicate<Integer> p2 = (value) -> value % 2 == 0;
		PredicateAsMethodArgumentDemo.method(p2, arr);

		System.out.println("Number even & Number is greate than 10 :");
		PredicateAsMethodArgumentDemo.method(p1.and(p2), arr);

		System.out.println("Number even or Number is greate than 10 :");
		PredicateAsMethodArgumentDemo.method(p1.or(p2), arr);

		System.out.println("Number is less than equals 10:");
		PredicateAsMethodArgumentDemo.method(p1.negate(), arr);
	}

	public static void method(Predicate<Integer> predicate, int[] arr) {

		for (int i : arr) {
			if (predicate.test(i)) {
				System.out.println(i);
			}
		}
	}
}
