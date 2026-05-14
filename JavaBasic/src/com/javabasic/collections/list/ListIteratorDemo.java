package com.javabasic.collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);

		ListIterator<Integer> listIterator = linkedList.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
