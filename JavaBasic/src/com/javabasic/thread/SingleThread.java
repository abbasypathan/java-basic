package com.javabasic.thread;

public class SingleThread {

	// Main thread which will execute all code as per flow
	public static void main(String[] args) {
		SingleThread singleThread = new SingleThread();
		singleThread.printNumbers();
		for (int i = 0; i <= 100; i++) {
			System.out.println("i :" + i + "\t");
		}
	}

	public void printNumbers() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("j :" + i + "\t");
		}
	}
}
