package com.javabasic.java9features.privateinterface;

public interface PrivateInterface {

	default void method1() {
		method3();
		System.out.println("default method");
	}

	static void method2() {
		System.out.println("static method");
	}

	private void method3() {
		method4();
		System.out.println("private method");
	}

	private static void method4() {
		System.out.println("private static method");
	}
}
