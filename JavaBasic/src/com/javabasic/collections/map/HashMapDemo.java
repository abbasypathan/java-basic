package com.javabasic.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Abbas");
		map.put(103, "Rahul");
		map.put(104, "Kumar");
		map.put(102, "Pathan");

		map.remove(104);
		map.replace(105, "Test");
		map.put(null, "NullCheck");
		map.put(null, "NullCheck1");// It will replace null key value

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
	}
}
