package com.javabasic.java17features.switchpattern;

public class SwitchPatternDemo {

	// Before switch patter, traditional way
	public static double getPerimeter(Shape shape) {
		if (shape instanceof Circle circle) {
			return 2 * Math.PI * circle.radius();
		} else if (shape instanceof Rectangle rectangle) {
			return 2 * rectangle.length() * rectangle.width();
		} else {
			throw new IllegalArgumentException();
		}
	}

	// Using switch matching pattern
	public static double getPerimeterUsingSwitch(Shape shape) {
		return switch (shape) {
		case Circle circle -> 2 * Math.PI * circle.radius();
		case Rectangle rectangle -> 2 * rectangle.length() * rectangle.width();
		default -> throw new IllegalArgumentException();
		};
	}

	// We can add null as separate case under switch
	public static void testNullSupport(Object obj) {
		switch (obj) {
		case String s -> System.out.println(s);
		case null -> System.out.println("Unknown");
		default -> throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		System.out.println(SwitchPatternDemo.getPerimeter(new Circle(2)));
		System.out.println(SwitchPatternDemo.getPerimeterUsingSwitch(new Circle(2)));
		SwitchPatternDemo.testNullSupport("ABC");
		SwitchPatternDemo.testNullSupport(null);
	}
}
