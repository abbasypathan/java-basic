package com.javabasic.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LoadClassDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> myClass = Class.forName(Calculator.class.getName());
		System.out.println(myClass);

		Constructor<?>[] constructors = myClass.getConstructors();
		System.out.println(Arrays.toString(constructors));

		Method[] methods = myClass.getMethods();
		System.out.println(Arrays.toString(methods));

		// Create new object of Calculator using default constructor
		Constructor<?> constructors1 = myClass.getConstructor(null);
		System.out.println(constructors1.newInstance(null));

		// Create new object of Calculator using parameterized constructor
		Constructor<?> constructors2 = myClass.getConstructor(double.class, double.class);
		Object newInstance = constructors2.newInstance(5, 10);
		System.out.println(newInstance);

		Method meth3 = myClass.getMethod("setNum1", double.class);
		meth3.invoke(newInstance, 20);

		Method meth4 = myClass.getMethod("setNum2", double.class);
		meth4.invoke(newInstance, 50);

		Field declaredField = myClass.getDeclaredField("num1");
		declaredField.setAccessible(true);

		declaredField.set(newInstance, 44);

		Method meth = myClass.getMethod("getNum1", null);
		System.out.println(meth.invoke(newInstance, null));

		Method meth2 = myClass.getMethod("getNum2", null);
		System.out.println(meth2.invoke(newInstance, null));

		Method meth5 = myClass.getMethod("sum", int.class, int.class);
		System.out.println(meth5.invoke(newInstance, 23, 34));

		Annotation[] annotations = myClass.getAnnotations();
		System.out.println(Arrays.toString(annotations));

		MyAnnotation annotation = (MyAnnotation) annotations[0];
		System.out.println(annotation.value1());
		System.out.println(annotation.value2());
	}
}
