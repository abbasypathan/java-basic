package com.javabasic.thread.threadcommunication;

public class MyThread extends Thread {

	public int total;

	@Override
	public void run() {
		System.out.println("Child thread calculating sum : ");
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				total += i;
			}
			this.notify();
		}

	}
}
