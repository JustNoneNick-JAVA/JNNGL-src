package com.jnngl.library.cursor;

import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import com.jnngl.library.display.Display;

public class CustomCursor {
	
	public void setCursor(Image ci) {
		Display.getWindow().setCursor(Toolkit.getDefaultToolkit().createCustomCursor(ci, new Point(Display.getWindow().getX(), Display.getWindow().getY()), "cursor"));
	}
	
}
