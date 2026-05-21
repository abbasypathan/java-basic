package com.javabasic.collections.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		Set<String> courses = new CopyOnWriteArraySet<>();
		courses.add("Java");
		courses.add("Paython");
		courses.add("AWS");
		courses.add("Docker");
		courses.add("Docker");
		courses.add("K8");

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
			if (next.equals("Docker")) {
				courses.add("Node");// It will create new copy of set and add into it at the end it will merge into one
				courses.remove("Docker");
			}
		}
		System.out.println(courses);
	}
}
