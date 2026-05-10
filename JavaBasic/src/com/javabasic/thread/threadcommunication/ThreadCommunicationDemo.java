package com.javabasic.thread.threadcommunication;

public class ThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		synchronized (myThread) {
			System.out.println("Main thread going to wait");
			myThread.wait();
			System.out.println("Main thread notifed");
		}
		System.out.println(myThread.total);
	}
}
