package com.javabasic.flowcontrol;

public class LabelledBlock {

	public static void main(String[] args) {
		int x = 2;
		myblock: {
			System.out.println("Inside labelled block");

			if (x == 2) {
				break myblock;
			}
			System.out.println("After break block");
		}
	}
}
/*
 OUTPUT :
 Inside labelled block
 */