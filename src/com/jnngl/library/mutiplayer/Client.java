package com.jnngl.library.mutiplayer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	static Socket s;
	static DataInputStream dis;
	static DataOutputStream dos;
	private String totaltext;
	
	public String getMessage() {
		return totaltext;
	}
	
	@SuppressWarnings("resource")
	public void connect(InputStream input) throws UnknownHostException, IOException {
		System.out.println("Connecting...");
		s = new Socket("localhost", 7777);
		System.out.println("Connetion successful");
		dis = new DataInputStream(s.getInputStream());
		dos = new DataOutputStream(s.getOutputStream());
		Input in = new Input(dis);
		Thread thread = new Thread(in);
		thread.start();
		Scanner s = new Scanner(input);
		while(true) {
			String str = s.nextLine();
			dos.writeUTF(str);
			this.totaltext = str;
		}
	}
	
}

class Input implements Runnable {

	DataInputStream in;
	
	public Input(DataInputStream in) {
		this.in = in;
	}
	
	@Override
	public void run() {
		while(true) {
			String mess;
			try {
				mess = in.readUTF();
				System.out.println(mess);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}