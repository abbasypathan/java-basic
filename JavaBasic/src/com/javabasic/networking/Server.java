package com.javabasic.networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("Awaiting for client on port 8080...");
			Socket socket = serverSocket.accept();
			System.out.println("Connection established");
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			System.out.println("Data : " + dataInputStream.readUTF());
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
