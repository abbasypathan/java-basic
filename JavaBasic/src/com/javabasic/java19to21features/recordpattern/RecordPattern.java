package com.javabasic.java19to21features.recordpattern;

record Point(int x, int y) {

}

public class RecordPattern {

	public static void main(String[] args) {
		Object obj = new Point(10, 20);
		if (obj instanceof Point(int x, int y)) {
			System.out.println("X = " + x + " Y = " + y);
		}
	}
}
