package com.javabasic.collections.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(101, "Abbas");
		map.put(102, "Rahul");

		System.out.println(map);

		System.out.println(map.get(101));
	}
}
