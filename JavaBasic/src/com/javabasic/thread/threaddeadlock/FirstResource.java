package com.javabasic.thread.threaddeadlock;

public class FirstResource {

	public synchronized void method1(SecondResource secondResource) {
		System.out.println("Inside method 1 R1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method 2 of R2");
		secondResource.method2();

	}

	public synchronized void method2() {
		System.out.println("Inside method 2 R1");
	}
}
