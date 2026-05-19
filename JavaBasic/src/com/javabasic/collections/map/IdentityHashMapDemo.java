package com.javabasic.collections.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		map.put(i1, "Abbas");
		map.put(i2, "Rahul");
		
		System.out.println(map.get(i2));
		System.out.println(map.get(i1));
		System.out.println(map);
	}
}
