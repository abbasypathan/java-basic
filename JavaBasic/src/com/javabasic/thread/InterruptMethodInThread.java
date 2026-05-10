package com.javabasic.thread;

public class InterruptMethodInThread extends Thread {

	public static void main(String[] args) {
		InterruptMethodInThread thread = new InterruptMethodInThread();
		thread.start();

		thread.interrupt();

		System.out.println("End of main thread");
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("I'm lazy thread");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("System got interrupted by thread " + Thread.currentThread().getName());
		}

	}
}
