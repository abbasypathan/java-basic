package com.javabasic.thread;

public class MultiThread extends Thread {

	// Main thread which will execute all code as per flow
	public static void main(String[] args) {
		MultiThread thread = new MultiThread();
		// start() will create new thread and execute run() method which is from Thread
		thread.start();
		for (int i = 0; i <= 100; i++) {
			System.out.println("i :" + i + "\t");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("j :" + i + "\t");
			// Added just to check multi threading in action
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
