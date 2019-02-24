package com.jnngl.library.exceptions;

@SuppressWarnings("serial")
public class InvalidKeyException extends Exception {
	
	public void print() {
		System.err.println(getMessage());
		System.exit(0);
	}

}
