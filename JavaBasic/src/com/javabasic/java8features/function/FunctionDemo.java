package com.javabasic.java8features.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> function = (str) -> {
			return str.length();
		};

		System.out.println("Length : " + function.apply("Abbas"));
	}
}
