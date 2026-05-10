package com.javabasic.nonstaticcontext;

public class NonStaticBlock {

	{
		System.out.println("Inside non static block");
	}

	NonStaticBlock() {
		System.out.println("Inside constructor");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		new NonStaticBlock();
	}
}
/*
OUPPUT:
Inside main method
Inside non static block
Inside constructor
*/