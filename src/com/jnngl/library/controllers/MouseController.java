package com.jnngl.library.controllers;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jnngl.library.display.Display;
import com.jnngl.library.exceptions.InvalidKeyException;

public class MouseController {
	
	boolean b = false;
	
	public boolean isMousePressed(int key, Rectangle rect) throws InvalidKeyException {
		
		Display.getWindow().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent k) {
				
				for(int x = rect.x; x < x+rect.width; x++) {
					for(int y = rect.y; y < y+rect.height; y++) {
						if(k.getX() == x && k.getY() == y) {
							b = true;
						} else {
							b = false;
						}
					}
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
		});
		return b;
		
	}
	
}
