package com.javabasic.networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8080);
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataOutputStream.writeUTF("Hello from cilent");
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
