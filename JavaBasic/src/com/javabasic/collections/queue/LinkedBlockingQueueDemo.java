package com.javabasic.collections.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {

	public static void main(String[] args) throws Exception {

		LinkedBlockingQueue<Integer> q = new LinkedBlockingQueue<>(2);

		q.put(10);
		q.put(20);

		System.out.println(q.take());

		q.put(30);

		System.out.println(q);
	}
}
