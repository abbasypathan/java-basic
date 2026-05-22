package com.javabasic.java8features.predicate;

import java.util.function.Predicate;

public class PredicateAsMethodArgumentDemo {

	public static void main(String[] args) {
		int[] arr = { 0, 7, 6, 10, 30, 50, 70, 73 };

		Predicate<Integer> predicate = (value) -> value > 10;

		PredicateAsMethodArgumentDemo.method(predicate, arr);
	}

	public static void method(Predicate<Integer> predicate, int[] arr) {

		for (int i : arr) {
			if (predicate.test(i)) {
				System.out.println(i);
			}
		}
	}
}
