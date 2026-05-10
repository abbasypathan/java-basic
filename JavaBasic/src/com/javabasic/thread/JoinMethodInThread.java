package com.javabasic.thread;

public class JoinMethodInThread extends Thread {

	public int num;

	JoinMethodInThread(int num) {
		this.num = num;
	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethodInThread thread1 = new JoinMethodInThread(3);
		JoinMethodInThread thread2 = new JoinMethodInThread(4);
		JoinMethodInThread thread3 = new JoinMethodInThread(5);

		thread1.start();
		thread2.start();
		thread3.start();

		// Other thread wait for this thread to be completed
		thread1.join();
		thread2.join();
		thread3.join();
	}

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			this.num += i;
		}
		System.out.println("Result : " + this.num);
	}
}
