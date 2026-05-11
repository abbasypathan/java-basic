package com.javabasic.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();

		System.out.println("Initial capacity : " + stringBuffer.capacity());

		stringBuffer.append("All the power within you");
		stringBuffer.append("more sting to increase capacity");
		
		System.out.println(stringBuffer);
		
		System.out.println("Initial capacity : " + stringBuffer.capacity());
	}
}
