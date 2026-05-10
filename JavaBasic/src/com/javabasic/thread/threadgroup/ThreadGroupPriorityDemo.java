package com.javabasic.thread.threadgroup;

public class ThreadGroupPriorityDemo {

	public static void main(String[] args) {

		ThreadGroup parentGroup = new ThreadGroup("Parent");
		System.out.println(parentGroup.getName());

		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child");
		System.out.println(childGroup.getName());

		childGroup.setMaxPriority(4);
		Thread thread1 = new Thread(childGroup, "Thread 1");
		Thread thread2 = new Thread(childGroup, "Thread 2");
		Thread thread3 = new Thread(childGroup, "Thread 3");
		thread3.setPriority(3);
		System.out.println(thread1.getName() + " : " + thread1.getPriority());//4
		System.out.println(thread2.getName() + " : " + thread2.getPriority());//4
		System.out.println(thread3.getName() + " : " + thread3.getPriority());//3
	}
}
