package com.javabasic.thread.threadgroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup parentGroup = new ThreadGroup("Parent");
		System.out.println(parentGroup.getName());
		
		ThreadGroup childGroup = new ThreadGroup(parentGroup,"Child");
		System.out.println(childGroup.getName());//Child
		System.out.println(childGroup.getParent().getName());//Parent
		System.out.println(childGroup.getParent().getParent().getName());//main
		System.out.println(childGroup.getParent().getParent().getParent().getName());//system
	}
}
