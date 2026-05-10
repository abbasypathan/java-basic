package com.javabasic.thread.synchronization.classlevel;

public class DisplayMessage {

	public synchronized static void sayHello1(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("How are you m1 : " + name);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public synchronized static void sayHello2(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("How are you m2 : " + name);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
