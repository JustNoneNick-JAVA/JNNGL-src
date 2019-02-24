package com.jnngl.library.ai;

import com.jnngl.library.event.Collision;
import com.jnngl.library.objects.MapObject;

public class Physics {
	
	private MapObject obj1;
	private MapObject obj2;
	
	int speedY = 0, speedX = 0;
	
	private Collision collision = new Collision();

	public Physics(MapObject obj1, MapObject obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void tick() {
		collision.setCollision(obj1.getBounds(), obj2.getBounds());
		System.out.println("tick");
		if(collision.getResult() == false && speedY <= 10) {
			speedY += 1;
			obj1.setY(obj1.y += 1);
		}
	}
	
}
