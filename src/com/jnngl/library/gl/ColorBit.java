package com.jnngl.library.gl;

import java.awt.Color;
import java.util.Random;

public class ColorBit {
	
	int r, g, b, a, rgb, c, rgba;
	
	public static final int GL_COLOR_BIT_RGB = 0, GL_COLOR_BIT_RGBA = 1, GL_COLOR_BIT_CUSTOM = 2, GL_COLOR_BIT_RG = 3,
			GL_COLOR_BIT_R = 4, GL_COLOR_BUFFER_RED = 10, GL_COLOR_BUFFER_GREEN = 11, GL_COLOR_BUFFER_BLUE = 12, 
			GL_COLOR_BIT_FULL_RGB = 5, GL_COLOR_BIT_FULL_RGBA = 6;
	
	public ColorBit(Color c) {
		r = c.getRed();
		g = c.getGreen();
		b = c.getBlue();
		a = c.getAlpha();
		rgb = r + b + g;
		rgba = r + b + g + a;
		Random r = new Random();
		this.c = r.nextInt(255);
	}
	public ColorBit(int r, int g, int b, int a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
		rgb = r + b + g;
		rgba = r + b + g + a;
		Random ra = new Random();
		c = ra.nextInt(255);
	}
	
	public int[] getColor(int target) {
		int[] colorbit = new int[5];
		
		if(target == 0) {
			colorbit = new int[]{r, g, b};
		}
		else if(target == 1) {
			colorbit = new int[]{r, g, b, a};
		}
		else if(target == 2) {
			colorbit = new int[]{r, g, b, a, c};
		}
		else if(target == 3) {
			colorbit = new int[]{r, g};
		}
		else if(target == 4) {
			colorbit = new int[]{r};
		}
		else if(target == 10) {
			colorbit = new int[]{r, r, r};
		}
		else if(target == 11) {
			colorbit = new int[]{g, g, g};
		}
		else if(target == 12) {
			colorbit = new int[]{b, b, b};
		}
		else if(target == 5) {
			colorbit = new int[]{rgb};
		}
		else if(target == 6) {
			colorbit = new int[]{rgba};
		} else {
			colorbit = new int[]{0, 0, 0, 0, 0};
		}
		
		return colorbit; 
	}
	
}
