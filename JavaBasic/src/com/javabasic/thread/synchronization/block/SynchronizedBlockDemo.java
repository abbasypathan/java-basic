package com.javabasic.thread.synchronization.block;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		DisplayMessage displayMessage = new DisplayMessage();
		MyThread thread1 = new MyThread(displayMessage, "Abbas");
		MyThread thread2 = new MyThread(displayMessage, "Pathan");
		thread1.start();
		thread2.start();
	}
}
