package com.javabasic.java19to21features.virtualthread;

public class VirtualThread {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Running in : " + Thread.currentThread());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread startVirtualThread = Thread.startVirtualThread(runnable);
		try {
			startVirtualThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
