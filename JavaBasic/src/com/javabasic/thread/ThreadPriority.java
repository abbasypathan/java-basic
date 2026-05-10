package com.javabasic.thread;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {
		ThreadPriority thread1 = new ThreadPriority();
		thread1.setPriority(MIN_PRIORITY);
		thread1.setName("my-first-thread");

		ThreadPriority thread2 = new ThreadPriority();
		thread2.setPriority(MAX_PRIORITY);
		thread2.setName("my-first-thread");

		thread1.start();
		thread2.start();

		Thread thread = Thread.currentThread();
		System.out.println("Thread priority of thread " + thread.getName() + " : " + thread.getPriority());
	}

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("Thread priority of thread " + thread.getName() + " : " + thread.getPriority());
	}
}
/*
OUTPUT :
Thread priority of thread main : 5
Thread priority of thread my-first-thread : 10
Thread priority of thread my-first-thread : 1
*/