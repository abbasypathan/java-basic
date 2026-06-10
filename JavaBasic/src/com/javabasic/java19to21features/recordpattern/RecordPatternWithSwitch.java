package com.javabasic.java19to21features.recordpattern;

public class RecordPatternWithSwitch {

	public static void main(String[] args) {
		print(new Point(20, 30));
	}

	private static void print(Point point) {
		switch (point) {
		case Point(int x, int y) -> System.out.println("X = " + x + " Y = " + y);
		}
	}
}
