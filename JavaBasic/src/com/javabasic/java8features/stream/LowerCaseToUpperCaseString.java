package com.javabasic.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseToUpperCaseString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("john");
		list.add("abbas");
		list.add("bharat");
		list.add("jim");

		List<String> collect = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
