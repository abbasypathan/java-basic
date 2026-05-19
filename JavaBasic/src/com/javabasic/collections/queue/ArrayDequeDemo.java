package com.javabasic.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {

		Deque<Integer> dq = new ArrayDeque<>();

		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.addFirst(40);
		dq.addLast(22);

		System.out.println(dq);

		System.out.println(dq.pollFirst());
	}
}
