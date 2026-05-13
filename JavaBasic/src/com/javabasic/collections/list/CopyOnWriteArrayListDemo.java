package com.javabasic.collections.list;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add(10);
		copyOnWriteArrayList.add(20);
		copyOnWriteArrayList.add(30);
		copyOnWriteArrayList.add(40);
		System.out.println(copyOnWriteArrayList);
	}
}
