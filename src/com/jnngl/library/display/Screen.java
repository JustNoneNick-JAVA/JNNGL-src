package com.jnngl.library.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Screen extends ApplicationListener {
	
	public static ApplicationListener App;
	private Graphics g;
	private ApplicationListener al = this;
	
	public ApplicationListener getApplicationListener() {
		return al;
	}

	public Screen() {
		repaint();
		create();
	}
	
	@Override
	public void paint(Graphics g) {
		if(Display.DRAW_SOURCE != true) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 10000, 10000);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Trebuchet MS", 72, 72));
			if(Display.DRAW_SOURCE!=true) {
				g.drawString("Loading...", Display.getWidth() / 2 - 150, Display.getHeight() / 2);
			}
		}
		setGraphics(g);
	}
	
	public void addToDraw(ApplicationListener al) {
		this.al = al;
	}

	public void setGraphics(Graphics g) {
		this.g = g;
	}
	
	public Graphics getGraphicsToDraw() {
		return g;
	}
	
	public void add(ApplicationListener al) {
		ApplicationListener.setToDrawMhetod(al, g);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void create() {
		
	}
	
}
