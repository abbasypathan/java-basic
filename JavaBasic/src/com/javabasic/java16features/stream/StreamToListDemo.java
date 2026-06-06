package com.javabasic.java16features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToListDemo {

	public static void main(String[] args) {
		List<String> ids = Arrays.asList("123", "456", "789");
		//Before
		List<Integer> collect = ids.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(collect);
		//After
		List<Integer> list = ids.stream().map(Integer::parseInt).toList();
		System.out.println(list);
	}
}
