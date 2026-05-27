package com.javabasic.java8features.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println("Is Present : " + empty.isPresent());
		System.out.println("Is Empty : " + empty.isEmpty());

		Optional<String> data = Optional.of("Abbas");
		System.out.println("Is Present : " + data.isPresent());
		System.out.println("Is Empty : " + data.isEmpty());
		System.out.println("Data : " + data.get());

		System.out.println(data.filter(s -> s.equals("Abbas")));
		System.out.println(data.filter(s -> s.equals("Abbas Pathan")));

		System.out.println(data.orElse("Abbas Pathan"));
		System.out.println(empty.orElse("Abbas Pathan"));

		data.ifPresent(System.out::println);
	}
}
