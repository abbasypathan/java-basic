package com.javabasic.thread;

public class ThreadIdentity extends Thread {

	public static void main(String[] args) {
		ThreadIdentity threadIdentity = new ThreadIdentity();
		threadIdentity.start();
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread Name : " + thread.getName());
	}

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread Name : " + thread.getName());
	}

}
