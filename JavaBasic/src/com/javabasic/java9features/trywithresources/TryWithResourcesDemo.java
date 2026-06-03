package com.javabasic.java9features.trywithresources;

public class TryWithResourcesDemo implements AutoCloseable {

	TryWithResourcesDemo() {
		System.out.println("Creating resources");
	}

	public void method1() {
		System.out.println("Doing something");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing resources");
	}

	public static void main(String[] args) {
		
		TryWithResourcesDemo demo = new TryWithResourcesDemo();

		try (demo) {
			demo.method1();
		} catch (Exception e) {

		}
	}

}
