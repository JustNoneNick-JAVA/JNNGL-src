package com.jnngl.library.event;

import java.awt.Rectangle;

public class Collision {
	
	private Rectangle r2;
	private Rectangle r1;

	public void setCollision(Rectangle r1, Rectangle r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	
	/* usage:
	 * if(getResult()) {
	 * 	   ...
	 * }
	 */
	public boolean getResult() {
		
		boolean result;
		
		if(r1.intersects(r2)) result = true;
		else result = false;
		
		return result;
		
	}
	
}
