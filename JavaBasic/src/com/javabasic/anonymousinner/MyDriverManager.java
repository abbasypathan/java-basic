package com.javabasic.anonymousinner;

public class MyDriverManager {

	static Connection newConnection() {
		Connection connection = new Connection() {

			@Override
			public void createStatement() {
				System.out.println("Inside create statement");
			}
		};
		return connection;
	}

	public static void main(String[] args) {
		Connection newConnection = MyDriverManager.newConnection();
		newConnection.createStatement();
	}
}
