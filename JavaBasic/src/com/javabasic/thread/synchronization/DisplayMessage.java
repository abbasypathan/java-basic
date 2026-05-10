package com.javabasic.thread.synchronization;

public class DisplayMessage {

	public synchronized void sayHello(String name) {
		System.out.println("How are you :" + name);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
