package com.javabasic.collections.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws Exception {

		WeakHashMap<Integer, String> map = new WeakHashMap<>();

		Integer key = Integer.valueOf(100);

		map.put(key, "Abbas");

		System.out.println("Before GC: " + map);

		key = null;

		System.gc();// It's a request it may not collect

		Thread.sleep(10000);

		System.out.println("After GC: " + map);
	}
}
