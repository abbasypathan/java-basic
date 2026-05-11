package com.javabasic.localinnerclass;

public class Outer {

	void f1() {
		System.out.println("Inside outer method");

		class LocalInner {
			void f2() {
				System.out.println("Inside local inner class methods");
			}
		}
		LocalInner inner = new LocalInner();
		inner.f2();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();
	}
}
