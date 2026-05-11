package com.javabasic.immutable;

public class ImmutableDemo {

	int x;

	ImmutableDemo(int x) {
		this.x = x;
	}

	public ImmutableDemo change(int x) {
		if (this.x == x) {
			return this;
		} else {
			return new ImmutableDemo(x);
		}
	}

	public static void main(String[] args) {
		ImmutableDemo m1 = new ImmutableDemo(10);
		ImmutableDemo m2 = m1.change(10);
		System.out.println(m1);
		System.out.println(m2);

		ImmutableDemo m3 = m1.change(20);
		System.out.println(m3);
	}
}
