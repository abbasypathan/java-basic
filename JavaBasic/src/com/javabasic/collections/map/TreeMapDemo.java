package com.javabasic.collections.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

		map.put(101, "A");
		map.put(103, "B");
		map.put(102, "C");

		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.higherKey(103));
		System.out.println(map.higherKey(10));
	}
}
