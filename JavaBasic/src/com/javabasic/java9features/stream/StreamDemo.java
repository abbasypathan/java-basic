package com.javabasic.java9features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(20, 30, 23, 12, 50);
		System.out.println(integers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList()));
		System.out.println(integers.stream().takeWhile(n -> n % 5 == 0).collect(Collectors.toList()));
		System.out.println(integers.stream().dropWhile(n -> n % 5 == 0).collect(Collectors.toList()));
		System.out.println(integers.stream().dropWhile(n -> n % 5 == 0).collect(Collectors.toList()));
	}
}
