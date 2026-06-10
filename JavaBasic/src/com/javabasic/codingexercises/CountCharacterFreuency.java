package com.javabasic.codingexercises;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacterFreuency {

	public static void main(String[] args) {
		String str = "Hello from abbas";

		Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).filter(ch -> ch != ' ')
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println(collect);
	}
}
