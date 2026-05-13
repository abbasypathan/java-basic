package com.javabasic.collections.set;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

		set.add("B");
		set.add("A");
		set.add("C");
		set.add("A"); // duplicate ignored

		System.out.println(set);

	}
}
