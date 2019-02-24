package com.jnngl.library.controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.jnngl.library.display.Display;
import com.jnngl.library.exceptions.InvalidKeyException;

public class KeysController {

	boolean b = false;
	
	public boolean isKeyPressed(int key) throws InvalidKeyException {
		
		Display.getWindow().addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent k) {
				
				if(k.getKeyCode() == key) {
					b = true;
				} else {
					b = false;
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			
		});
		return b;
		
	}
	
}
