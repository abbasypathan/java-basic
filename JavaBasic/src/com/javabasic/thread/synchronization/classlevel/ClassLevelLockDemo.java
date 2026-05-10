package com.javabasic.thread.synchronization.classlevel;

public class ClassLevelLockDemo {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Abbas");
		MyThread thread2 = new MyThread("Pathan");
		thread1.start();
		thread2.start();
	}

}
