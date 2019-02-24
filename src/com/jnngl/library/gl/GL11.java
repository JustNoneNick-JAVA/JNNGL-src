package com.jnngl.library.gl;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.jnngl.library.display.Display;

@SuppressWarnings("serial")
public class GL11 extends JPanel {
	
	private static boolean protection, colorized, texture;
	private static boolean isEnd = true;
	private static int pmode = 2;
	public static final int GL_QUADS = 0, GL_LINES = 1, GL_CLEAR = 2, GL_DRAW_QUAD = 3;
	
	static BufferedImage img;
	
	static Graphics gr;
	
	public static boolean isProtection() {
		return protection;
	}
	
	public static void enableProtection(boolean protection) {
		GL11.protection = protection;
	}
	
	public static boolean isColorized() {
		return colorized;
	}
	
	public static void enableColorized(boolean colorized) {
		GL11.colorized = colorized;
	}

	public static boolean isTextureEnabeled() {
		return texture;
	}

	public static void enableTexture(boolean texture) {
		GL11.texture = texture;
	}
	
	
	public static void glEnd() {
		isEnd = true;
		draw();
	}
	
	public static void glBegin(int mode, Graphics g) {
		pmode = mode;
		isEnd = false;
		img = new BufferedImage(Display.getWidth(), Display.getHeight(), BufferedImage.TYPE_INT_RGB);
		gr = g;
	}
	
	private static void draw() {
		if(isEnd == false || protection == false) {
			if(pmode == 1) {
				if(colorized == true) {
					gr.setColor(Vertex.getColor());
				}
				gr.drawLine(Vertex.getX(), Vertex.getY(), Vertex.getX() + Vertex.getWidth(), Vertex.getY() + Vertex.getHeight());
			}
			if(pmode == 0) {
				if(colorized == true) {
					gr.setColor(Vertex.getColor());
				}
				gr.fillRect(Vertex.getX(), Vertex.getY(), Vertex.getWidth(), Vertex.getHeight());
			}
			if(pmode == 2) {
				gr.clearRect(Vertex.getX(), Vertex.getY(), Vertex.getWidth(), Vertex.getHeight());
			}
			if(pmode == 3) {
				if(colorized == true) {
					gr.setColor(Vertex.getColor());
				}
				gr.drawRect(Vertex.getX(), Vertex.getY(), Vertex.getWidth(), Vertex.getHeight());
			}
		}
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
}
