package com.javabasic.collections.queue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo implements Delayed {

	private String name;
	private long time;

	public DelayQueueDemo(String name, long delay) {
		this.name = name;
		this.time = System.currentTimeMillis() + delay;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long diff = time - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	@Override
	public int compareTo(Delayed o) {
		return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) throws InterruptedException {
		DelayQueue<DelayQueueDemo> queue = new DelayQueue<>();

		queue.put(new DelayQueueDemo("Task1", 5000));

		System.out.println("Waiting...");

		System.out.println(queue.take());
	}
}
