package com.javabasic.collections.queue;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {

	public static void main(String[] args) {

		SynchronousQueue<Integer> q = new SynchronousQueue<>();

		new Thread(() -> {
			try {
				System.out.println("Putting...");
				q.put(10);
				System.out.println("Inserted");
			} catch (Exception e) {
			}
		}).start();

		new Thread(() -> {
			try {
				Thread.sleep(3000);

				System.out.println("Taking...");
				System.out.println(q.take());

			} catch (Exception e) {
			}
		}).start();
	}
}
