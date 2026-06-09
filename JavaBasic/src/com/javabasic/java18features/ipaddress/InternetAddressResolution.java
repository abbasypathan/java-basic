package com.javabasic.java18features.ipaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAddressResolution {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
