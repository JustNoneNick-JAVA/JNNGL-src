package com.jnngl.library.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Traingle {
	
	public void drawTraingle(Graphics g, Color c, int x, int y, int width, int point) {
		g.setColor(c);
		g.drawLine(x, y, width, y);
		g.drawLine(x, y, width / 2, y -point);
		g.drawLine(x + width, y, x + width / 2, y -point);
	}
	
}
