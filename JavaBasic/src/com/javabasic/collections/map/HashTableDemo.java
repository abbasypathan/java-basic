package com.javabasic.collections.map;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>();

		table.put(101, "Abbas");
		table.put(102, "Rahul");
		table.put(103, "Amit");

		System.out.println(table);

		System.out.println(table.get(102));

		table.remove(103);

		System.out.println(table.containsKey(101));
	}
}
