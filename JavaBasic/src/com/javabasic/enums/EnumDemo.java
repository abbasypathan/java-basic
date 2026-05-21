package com.javabasic.enums;

public enum EnumDemo {

	MYSQL(9), ORACLE(12), SQLSERVER(7);

	int fee;

	EnumDemo(int fee) {
		this.fee = fee;
	}

	public int getFee() {
		return this.fee;
	}
	
	public static void main(String[] args) {
		EnumDemo[] values = EnumDemo.values(); 
		for (EnumDemo enumDemo : values) {
			System.out.println(enumDemo);
			System.out.println(enumDemo.ordinal());
			System.out.println(enumDemo.getFee());
		}
	}
}
