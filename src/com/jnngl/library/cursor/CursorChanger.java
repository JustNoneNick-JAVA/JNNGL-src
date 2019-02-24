package com.jnngl.library.cursor;

import java.awt.Cursor;

import com.jnngl.library.display.Display;

public class CursorChanger {
	
	public void hideCursor() {
		Display.getWindow().setCursor(null);
	}
	
	public void showCursor() {
		Display.getWindow().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	public void setCursor(int cursor) {
		Display.getWindow().setCursor(new Cursor(cursor));
	}
	
}
