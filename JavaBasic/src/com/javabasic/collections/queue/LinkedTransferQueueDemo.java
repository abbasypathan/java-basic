package com.javabasic.collections.queue;

import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueDemo {

	public static void main(String[] args) throws Exception {

		LinkedTransferQueue<Integer> q = new LinkedTransferQueue<>();

		q.put(10);
		q.put(20);

		System.out.println(q.take());
		System.out.println(q.take());
	}
}
