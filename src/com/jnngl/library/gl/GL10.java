package com.jnngl.library.gl;

import java.awt.Color;
import java.awt.Graphics;

import com.jnngl.library.display.Screen;

public class GL10 {
	
	public static GL10 glDrawPointer(ColorBit colorbit, int positions[]) {
		Screen s = new Screen();
		Graphics g = s.getGraphics();
		int[] color = colorbit.getColor(ColorBit.GL_COLOR_BIT_RGBA);
		g.setColor(new Color(color[0], color[1], color[2], color[3]));
		g.drawLine(positions[0], positions[1], positions[2], positions[3]);
		return new GL10();
	}
	
}
