package com.javabasic.java8features.lambdaexpression.anonymousclass;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Child Thread : " + i);
			}
		});
		thread.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread : " + i);
		}
	}
}
