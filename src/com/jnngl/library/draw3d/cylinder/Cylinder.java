package com.jnngl.library.draw3d.cylinder;

import java.awt.Color;
import java.awt.Graphics;

public class Cylinder {
	
	public void drawCylinder(Graphics g, Color c, int x, int y, int width, int height, int length, int p) {
		g.setColor(c.darker());
		for (int i = 0; i < length; i++) {
			if(p == 0)
				g.fillOval(x, y + i, width, height); else
				g.fillOval(x - (i / (p * 2)), y + i, width + (i / (p)), height);
		}
		g.setColor(c);
		g.fillOval(x, y, width, height);
	}
	
}
