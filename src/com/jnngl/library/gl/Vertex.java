package com.jnngl.library.gl;

import java.awt.Color;

public class Vertex {
	
	private static int px, py, pwidth, pheight;
	private static Color color;
	
	public static void setVertexPos2f(int x, int y) {
		px = x;
		py = y;
	}
	
	public static void setVertexSize2f(int width, int height) {
		pwidth = width;
		pheight = height;
	}
	
	public static void setVertexColor(ColorBit c, boolean alpha) {
		if(alpha == false) {
			color = new Color(c.r, c.g, c.b);
		} else {
			color = new Color(c.r, c.g, c.b, c.a);
		}
	}

	public static int getX() {
		return px;
	}

	public static int getY() {
		return py;
	}

	public static int getWidth() {
		return pwidth;
	}

	public static int getHeight() {
		return pheight;
	}
	
	public Vertex getThis() {
		return this;
	}

	public static Color getColor() {
		return color;
	}
	
}
