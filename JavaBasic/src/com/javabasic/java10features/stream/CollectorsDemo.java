package com.javabasic.java10features.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		var list = List.of(20, 22, 30, 9, 50);
		List<Integer> newList = list.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
		newList.add(33);// With toList() we can modify result list
		System.out.println(newList);
		
		List<Integer> unList = list.stream().filter(i -> i % 3 == 0).collect(Collectors.toUnmodifiableList());
		//unList.add(44); //It will throw UnsupportedOperationException
		System.out.println(unList);
	}
}
