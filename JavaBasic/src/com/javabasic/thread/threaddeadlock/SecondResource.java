package com.javabasic.thread.threaddeadlock;

public class SecondResource {

	public synchronized void method1(FirstResource firstResource) {
		System.out.println("Inside method 1 R2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method 2 of R1");
		firstResource.method2();

	}

	public synchronized void method2() {
		System.out.println("Inside method 2 R2");
	}
}
