package com.javabasic.java19to21features.virtualthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadUsingExecutors {

	public static void main(String[] args) {
		try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
			IntStream.range(0, 1000).forEach(i -> {
				executorService.submit(() -> {
					System.out.println("Task : " + i + " running in :" + Thread.currentThread());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				});
			});
		}
		System.out.println("All task submitted");
	}
}
