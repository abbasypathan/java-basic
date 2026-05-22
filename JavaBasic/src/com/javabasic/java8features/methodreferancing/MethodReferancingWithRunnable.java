package com.javabasic.java8features.methodreferancing;

public class MethodReferancingWithRunnable {

	public static void method() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child thread : " + i);
		}
	}

	public static void main(String[] args) {
		// method() implementation are provided to Runnable run() method
		Runnable runnable = MethodReferancingWithRunnable::method;
		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main thread : " + i);
		}
	}
}
