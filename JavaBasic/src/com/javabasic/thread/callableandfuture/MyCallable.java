package com.javabasic.thread.callableandfuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	int num;

	MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is calculating sum of number up to " + this.num);
		int sum = 0;
		for (int i = 0; i <= this.num; i++) {
			sum += i;
		}
		return sum;
	}
}
