package com.javabasic.java11features.stream;

import java.util.Optional;

public class OptionalUpdate {

	public static void main(String[] args) {
		Optional<String> str = Optional.empty();

		if (str.isEmpty()) {
			System.out.println("It's empty");
		}
	}
}
