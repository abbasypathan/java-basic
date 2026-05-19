package com.javabasic.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		for (int i = 10; i <= 20; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
	}
}
