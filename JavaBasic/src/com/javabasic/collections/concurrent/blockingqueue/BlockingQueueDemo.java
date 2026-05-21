package com.javabasic.collections.concurrent.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1024);
		OrderProducer orderProducer = new OrderProducer(blockingQueue);
		OrderConsumer orderConsumer = new OrderConsumer(blockingQueue);

		new Thread(orderProducer).start();
		new Thread(orderConsumer).start();
	}
}
