package com.javabasic.sort;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo implements Comparable<ComparableDemo> {

	public int id;
	public String name;

	ComparableDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Set<ComparableDemo> comparableDemos = new TreeSet<>();
		comparableDemos.add(new ComparableDemo(100, "Abbas"));
		comparableDemos.add(new ComparableDemo(400, "Pathan"));
		comparableDemos.add(new ComparableDemo(300, "Rahul"));
		comparableDemos.add(new ComparableDemo(600, "Kumar"));
		comparableDemos.add(new ComparableDemo(500, "Someone"));

		Iterator<ComparableDemo> iterator = comparableDemos.iterator();
		while (iterator.hasNext()) {
			ComparableDemo next = iterator.next();
			System.out.println(next.id);
		}
	}

	@Override
	public int compareTo(ComparableDemo o) {
		if (this.id < o.id) {
			return -1;
		} else if (this.id > o.id) {
			return 1;
		} else {
			return 0;
		}
	}
}
