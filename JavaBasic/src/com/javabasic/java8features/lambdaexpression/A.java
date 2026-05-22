package com.javabasic.java8features.lambdaexpression;

@FunctionalInterface
public interface A {
	void method();

	default void method2() {
		System.out.println("default method");
	}

	static void method3() {
		System.out.println("static method");
	}
}
