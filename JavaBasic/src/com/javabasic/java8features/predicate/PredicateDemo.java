package com.javabasic.java8features.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> intPredicate = (value) -> {
			return value > 20;
		};
		
		System.out.println(intPredicate.test(25));
		System.out.println(intPredicate.test(15));
		
		Predicate<String> strPredicate = (str) -> str.length()>5;
		
		System.out.println(strPredicate.test("Abbass"));
		System.out.println(strPredicate.test("xyz"));
	}
}
