package com.javabasic.thread.daemonthread;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		MyThread myThread = new MyThread();
		// After main threads complete execution this thread will also marked as completed as it's daemon thread
		myThread.setDaemon(true);
		myThread.start();
		System.out.println(myThread.isDaemon());
	}
}
