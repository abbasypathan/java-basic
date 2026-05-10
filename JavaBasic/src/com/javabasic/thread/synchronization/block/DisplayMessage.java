package com.javabasic.thread.synchronization.block;

public class DisplayMessage {

	public void sayHello(String name) {

		System.out.println("Can be executed all thread");

		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				System.out.println("How are you m1 : " + name);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		//OR 
		//This will apply class level lock
		synchronized (DisplayMessage.class) {
			for (int i = 0; i <= 10; i++) {
				System.out.println("How are you m1 : " + name);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
