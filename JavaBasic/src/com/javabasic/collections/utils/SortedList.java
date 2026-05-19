package com.javabasic.collections.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Z");
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("S");

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder());
		//Or
		Collections.reverse(list);
		System.out.println(list);

		int binarySearchIndex = Collections.binarySearch(list, "D");
		System.out.println(binarySearchIndex);
		
		int binarySearchIndex1 = Collections.binarySearch(list, "C");
		System.out.println(binarySearchIndex1);
	}
}
