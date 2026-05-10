package com.javabasic.thread.synchronization.classlevel;

public class MyThread extends Thread {

	public String name;

	MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		DisplayMessage.sayHello1(this.name);
		DisplayMessage.sayHello2(this.name);
	}
}
