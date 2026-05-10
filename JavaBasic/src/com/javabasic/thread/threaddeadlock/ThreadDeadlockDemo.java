package com.javabasic.thread.threaddeadlock;

public class ThreadDeadlockDemo extends Thread {

	public FirstResource firstResource = new FirstResource();
	public SecondResource secondResource = new SecondResource();

	ThreadDeadlockDemo() {
		new Thread(this).start();
		secondResource.method1(this.firstResource);
	}

	public static void main(String[] args) {
		new ThreadDeadlockDemo();
	}

	@Override
	public void run() {
		this.firstResource.method1(this.secondResource);
	}
}
