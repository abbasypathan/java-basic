package com.javabasic.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(101, "Abbas");
		linkedHashMap.put(103, "Rahul");
		linkedHashMap.put(104, "Kumar");
		linkedHashMap.put(102, "Pathan");

		linkedHashMap.remove(104);
		linkedHashMap.replace(105, "Test");
		linkedHashMap.put(null, "NullCheck");
		linkedHashMap.put(null, "NullCheck1");// It will replace null key value

		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
	}
}
