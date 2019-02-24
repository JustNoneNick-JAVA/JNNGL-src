package com.jnngl.library.pixel;

import java.awt.Graphics;

import com.jnngl.library.display.Screen;

public class Pixels {
	
	public void fillPixel(int x,int y) {
		Screen s = new Screen();
		Graphics g = s.getGraphics();
		g.fillRect(x, y, 1, 1);
	}
	
	public void drawPointGrid(int spacex, int spacey, int countx, int county) {
		Screen s = new Screen();
		Graphics g = s.getGraphics();
		for(int xx = 0; xx < countx * spacex; xx += spacex) {
			for(int yy = 0;yy < county * spacey; yy += spacey) {
				g.fillRect(xx, yy, 1, 1);
			}
		}
	}
	
	public static PixelFormat pixelToPixelFormat(int x, int y) {
		return new PixelFormat(x, y);
	}
	
	public static int[] PixelFormatToPositions(PixelFormat f) {
		return new int[] {f.getX(), f.getY()};
	}
}
