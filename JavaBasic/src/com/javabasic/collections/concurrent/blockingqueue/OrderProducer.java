package com.javabasic.collections.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;

	OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			queue.put("iPhone11");
			queue.put("iPhone12");
			queue.put("iPhone13");
			queue.put("iPhone14");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
