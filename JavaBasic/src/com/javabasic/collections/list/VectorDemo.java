package com.javabasic.collections.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		System.out.println(vector);

		vector.addFirst(40);
		vector.addLast(40);

		System.out.println(vector);

		vector.removeFirst();
		vector.set(2, 20);

		System.out.println(vector);
	}
}
