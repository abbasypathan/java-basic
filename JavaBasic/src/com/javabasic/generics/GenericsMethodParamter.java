package com.javabasic.generics;

public class GenericsMethodParamter {

	public <T> void method1(T obj) {
		System.out.println(obj.getClass().getName());
	}

	public <T extends Runnable> void method2(T obj) {
		System.out.println(obj.getClass().getName());
	}

	public <T extends Thread & Runnable> void method3(T obj) {
		System.out.println(obj.getClass().getName());
	}

	public static void main(String[] args) {
		GenericsMethodParamter genericsMethodParamter = new GenericsMethodParamter();
		genericsMethodParamter.method1(new String());
		genericsMethodParamter.method2(new Thread());
		genericsMethodParamter.method3(new Thread());
	}
}
