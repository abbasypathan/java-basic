package com.javabasic.java12features.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTeeing {

	public static void main(String[] args) {
		// Collectors method teeing() added which takes first 2 collectors operation and
		// 3rd as merging result of first 2
		ResultOfTeeing result = Stream.of(2, 3, 10, 20, 45, 6, 70).collect(Collectors.teeing(Collectors.counting(),
				Collectors.filtering(n -> n > 10, Collectors.toList()), ResultOfTeeing::new));
		System.out.println(result);
	}
}
