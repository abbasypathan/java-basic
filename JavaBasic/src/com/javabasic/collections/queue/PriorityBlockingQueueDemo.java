package com.javabasic.collections.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) throws Exception {

		PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();

		pq.put(30);
		pq.put(10);
		pq.put(20);

		System.out.println(pq);
	}
}
