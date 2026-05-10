package com.javabasic.thread.synchronization;

public class MyThread extends Thread {

	public DisplayMessage displayMessage;
	public String name;

	MyThread(DisplayMessage displayMessage, String name) {
		this.displayMessage = displayMessage;
		this.name = name;
	}

	@Override
	public void run() {
		this.displayMessage.sayHello(this.name);
	}
}
