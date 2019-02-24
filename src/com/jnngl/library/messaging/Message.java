package com.jnngl.library.messaging;

public final class Message {
	
	String message;
	
	public Message writeUTFMessage(String message) {
		this.message = message;
		return this;
	}
	
	public String readUTF() {
		return message;
	}
	
	public String readAndDestroyUTF() {
		destroyUTF();
		return readUTF();
	}

	public void destroyUTF() {
		message = ""; 
	}
	
}
