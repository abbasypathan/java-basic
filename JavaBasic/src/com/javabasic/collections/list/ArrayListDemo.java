package com.javabasic.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// If type is not provided by default it will be Object type
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(Integer.valueOf(10));
		arrayList.add(20);
		arrayList.add(30.20);
		arrayList.add("Abbas");

		System.out.println(arrayList);

		List<Integer> list = new ArrayList<>();
		list.add(Integer.valueOf(10));
		list.add(20);

		System.out.println(list);

		System.out.println(list.get(1));

		list.remove(0);

		System.out.println(list);
	}
}
