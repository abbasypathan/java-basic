package com.javabasic.thread.executorframework;

public class CheckProcessorTask implements Runnable {

	String name;

	CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name + " Check processor has begin processing " + Thread.currentThread().getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Check processor has been completed " + Thread.currentThread().getName());
	}
}
