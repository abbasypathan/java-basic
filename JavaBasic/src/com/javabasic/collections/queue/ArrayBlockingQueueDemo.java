package com.javabasic.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {

	public static void main(String[] args) throws Exception {

		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(2);

		q.put(10);
		q.put(20);

		System.out.println(q.take());

		q.put(30);
		//q.put(40); it will wait until space is not available as size is 2

		System.out.println(q);
	}
}
