package com.javabasic.collections.concurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {

	public static void main(String[] args) {
		ArrayList<String> courses = new ArrayList<>();
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
				courses.add("Node");// We will get ConcurrentModificationException as it will try to modify list which is being processed
				courses.remove("Docker");
			}
		}
	}
}
