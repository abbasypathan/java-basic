package com.javabasic.annotation;

public class AnnotationDemo {

	public static void main(String[] args) {
		AnnotationDemo annotationDemo = new AnnotationDemo();
		annotationDemo.myMethod();
	}

	@MyAnnotation
	public void myMethod() {
		System.out.println("Inside myMethod");
	}
}
