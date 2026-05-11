package com.javabasic.thread.callableandfuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureDemo {

	public static void main(String[] args) {
		MyCallable[] myCallables = { new MyCallable(11), new MyCallable(12), new MyCallable(13), new MyCallable(14),
				new MyCallable(15), new MyCallable(16), new MyCallable(17), new MyCallable(18), new MyCallable(19),
				new MyCallable(20), new MyCallable(21) };

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);

		for (MyCallable myCallable : myCallables) {
			Future<Integer> future = newFixedThreadPool.submit(myCallable);

			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		newFixedThreadPool.shutdown();
	}
}
