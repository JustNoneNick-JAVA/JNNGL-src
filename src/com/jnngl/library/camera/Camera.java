package com.jnngl.library.camera;

import java.awt.event.KeyEvent;

public class Camera {
	
	private int x, y;
	
	public void setLeft(boolean b) { 
		if(b == true) {
			x -= 0.1;
			b = false;
		}
	}
	public void setRight(boolean b) { 
		if(b == true) {
			x += 0.1;
			b = false;
		}
	}
	public void setUp(boolean b) { 
		if(b == true) {
			y -= 0.1;
			b = false;
		}
	}
	public void setDown(boolean b) { 
		if(b == true) {
			y += 0.1;
			b = false;
		}
	}
	
	public void WASD_pressed(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_W) setUp(true);
		if(k == KeyEvent.VK_S) setDown(true);
		if(k == KeyEvent.VK_D) setRight(true);
		if(k == KeyEvent.VK_A) setLeft(true);
	}
	
	public void WASD_released(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_W) setUp(false);
		if(k == KeyEvent.VK_S) setDown(false);
		if(k == KeyEvent.VK_D) setRight(false);
		if(k == KeyEvent.VK_A) setLeft(false);
	}
	
	public void ARROWS_pressed(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_UP) setUp(true);
		if(k == KeyEvent.VK_DOWN) setDown(true);
		if(k == KeyEvent.VK_RIGHT) setRight(true);
		if(k == KeyEvent.VK_LEFT) setLeft(true);
	}
	
	public void ARROWS_released(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_UP) setUp(false);
		if(k == KeyEvent.VK_DOWN) setDown(false);
		if(k == KeyEvent.VK_RIGHT) setRight(false);
		if(k == KeyEvent.VK_LEFT) setLeft(false);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
}
