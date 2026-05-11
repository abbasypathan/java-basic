package com.javabasic.thread.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] checkProcessorTasks = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		for (CheckProcessorTask checkProcessorTask : checkProcessorTasks) {
			newFixedThreadPool.submit(checkProcessorTask);
			// newFixedThreadPool.execute(checkProcessorTask);
		}
		newFixedThreadPool.shutdown();
	}
}
