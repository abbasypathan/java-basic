package com.javabasic.java8features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterEvenNumber {

	public static void main(String[] args) {
		Integer[] arr = { 23, 33, 40, 3, 56, 70, 12, 1 };
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		List<Integer> filter = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(filter);

		long count = list.stream().filter(num -> num % 2 == 0).count();
		System.out.println("Count : " + count);

		List<Integer> collect = list.stream().filter(num -> num % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println("Sorted : " + collect);

		List<Integer> collect1 = list.stream().filter(num -> num % 2 == 0).sorted().collect(Collectors.toList())
				.reversed();
		System.out.println("Decending Sorted : " + collect1);

		Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
		System.out.println("Min : " + min.get());

		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		System.out.println("Max : " + max.get());

		list.forEach(num -> System.out.println(num));
	}
}
