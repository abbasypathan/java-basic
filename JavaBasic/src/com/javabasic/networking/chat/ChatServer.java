package com.javabasic.networking.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9090);
			System.out.println("Server is ready to chat...");
			Socket socket = serverSocket.accept();

			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			String messageReceived = "";
			String messageSend = "";
			while (true) {
				messageReceived = in.readUTF();
				System.out.println("Client syas : " + messageReceived);
				if ("exit".equals(messageReceived)) {
					break;
				}
				messageSend = bufferedReader.readLine();
				out.writeUTF(messageSend);
				out.flush();
			}
			bufferedReader.close();
			out.close();
			in.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
