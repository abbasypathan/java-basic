package com.javabasic.staticcontext;

public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}

	static {
		System.out.println("Inside static block 2");
	}

	static {
		System.out.println("Inside static block 1");
	}
}
/*
OUTPUT : 
Inside static block 2
Inside static block 1
Inside main method
*/