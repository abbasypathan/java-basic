package com.javabasic.staticcontext;

public class StaticMethod {

	static {
		StaticMethod.method();
		System.out.println("Inside static block");
	}

	public static void method() {
		System.out.println("Inside static method");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		StaticMethod.method();
	}
}
/*
OUTPUT :
Inside static method
Inside static block
Inside main method
Inside static method
*/