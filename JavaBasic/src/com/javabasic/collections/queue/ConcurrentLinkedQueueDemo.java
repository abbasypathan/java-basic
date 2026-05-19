package com.javabasic.collections.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {

	public static void main(String[] args) {

		ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

		q.offer(10);
		q.offer(20);
		q.offer(30);

		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
