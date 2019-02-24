package com.jnngl.library.mutiplayer;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {

	static Users[] users = new Users[10000];
	
	static Socket s;
	static ServerSocket ss;
	static DataOutputStream dos;
	static DataInputStream dis;
	
	public void run() throws IOException {
		System.out.println("Starting server...");
		ss = new ServerSocket(7777);
		System.out.println("Server started");
		while(true) {
			s = ss.accept();
			for(int i = 0; i < 10000; i++) {
				System.out.println("Connection from: " + s.getInetAddress());
				dos = new DataOutputStream(s.getOutputStream());
				dos.writeUTF("Welcome to mutiplayer system, this message written in Server.java.run()");
				dis = new DataInputStream(s.getInputStream());
				if(users[i] == null) {
					users[i] = new Users(dos, dis, users);
					Thread thread = new Thread();
					thread.start();
					break;
				}
			}
		}
	}
	
}

class Users implements Runnable {

	DataOutputStream out;
	DataInputStream in;
	Users[] user = new Users[10000];
	
	public Users(DataOutputStream out, DataInputStream in, Users[] user) {
		this.out = out;
		this.in = in;
		this.user = user;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String mess = in.readUTF();
				for(int i = 0; i < 10000; i++) {
					if(user[i] != null) {
						user[i].out.writeUTF(mess);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
