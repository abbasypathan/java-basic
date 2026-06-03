package com.javabasic.java9features.privateinterface;

public class PrivateInterfaceDemo implements PrivateInterface {

	public static void main(String[] args) {
		PrivateInterfaceDemo demo = new PrivateInterfaceDemo();
		demo.method1();
		PrivateInterface.method2();
	}
}
