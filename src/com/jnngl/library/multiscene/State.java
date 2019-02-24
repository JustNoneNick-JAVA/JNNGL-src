package com.jnngl.library.multiscene;

import java.awt.Graphics;

public abstract class State {
	
	protected Gsm gsm;
	
	protected State(Gsm gsm) {
		this.gsm = gsm;
	}
	
	public abstract void render(Graphics g);
	public abstract void update();
	public abstract void handleInput();
	
}
