package com.javabasic.collections.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		List<String> courses = new CopyOnWriteArrayList<>();
		courses.add("Java");
		courses.add("Paython");
		courses.add("AWS");
		courses.add("Docker");
		courses.add("K8");

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
			if (next.equals("Docker")) {
				courses.add("Node");// It will create new copy of list and add into it at the end it will merge into one
				courses.remove("Docker");
			}
		}
		System.out.println(courses);
	}
}
