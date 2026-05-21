package com.javabasic.enums;

public class PaymentTypeTest {

	public static void main(String[] args) {
		PaymentType paymentType = PaymentType.CREDIT;
		System.out.println(paymentType);

		PaymentType[] values = PaymentType.values();
		for (PaymentType type : values) {
			System.out.println(type);
			System.out.println(type.ordinal());
		}
	}
}
