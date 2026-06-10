package com.javabasic.networking.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 9090);

			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			String messageReceived = "";
			String messageSend = "";
			while (true) {
				messageSend = bufferedReader.readLine();
				out.writeUTF(messageSend);
				out.flush();
				if ("exit".equals(messageSend)) {
					break;
				}
				messageReceived = in.readUTF();
				System.out.println("Server syas : " + messageReceived);
			}
			bufferedReader.close();
			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
