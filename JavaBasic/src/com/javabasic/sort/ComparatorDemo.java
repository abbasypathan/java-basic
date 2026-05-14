package com.javabasic.sort;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public int id;
	public String name;

	ComparatorDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Set<ComparatorDemo> comparableDemos = new TreeSet<>(new MyComparator());
		comparableDemos.add(new ComparatorDemo(100, "Abbas"));
		comparableDemos.add(new ComparatorDemo(400, "Pathan"));
		comparableDemos.add(new ComparatorDemo(300, "Rahul"));
		comparableDemos.add(new ComparatorDemo(600, "Kumar"));
		comparableDemos.add(new ComparatorDemo(500, "Someone"));

		Iterator<ComparatorDemo> iterator = comparableDemos.iterator();
		while (iterator.hasNext()) {
			ComparatorDemo next = iterator.next();
			System.out.println(next.id + " " + next.name);
		}
	}
}
