package com.jnngl.library.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle3D {
	
	public void draw3DRectangle(Graphics g, Color c, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		g.setColor(c);
		for(int i = 0; i < y2; i++) {
			g.drawLine(x1, i, x3, y3 + i);
		}
	}
	
}
