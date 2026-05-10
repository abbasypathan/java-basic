package com.javabasic.thread;

public class ThreadUsingRunnable implements Runnable {

	public static void main(String[] args) {
		ThreadUsingRunnable runnable = new ThreadUsingRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Thread name is : " + Thread.currentThread().getName());
	}
}
