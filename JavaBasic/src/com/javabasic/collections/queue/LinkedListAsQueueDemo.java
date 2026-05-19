package com.javabasic.collections.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(40);
		queue.add(50);
		
		System.out.println(queue);
		System.out.println(queue.peek());
		
		Deque<Integer> dq = new LinkedList<>();

		dq.addFirst(10);
		dq.addLast(20);

		System.out.println(dq);
		System.out.println(dq.removeFirst());
		System.out.println(dq.removeLast());
	}
}
