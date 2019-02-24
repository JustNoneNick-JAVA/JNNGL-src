package com.jnngl.library.objects;

import java.awt.Color;
import java.awt.Graphics;

import com.jnngl.library.ai.Physics;
import com.jnngl.library.images.Sprite;
import com.jnngl.library.orentation.Type;

public class Rectangle extends MapObject {

	public Rectangle(int x, int y, int width, int height, Type type) {
		super(type);
		setWidth(width);
		setHeight(height);
		setX(x);
		setY(y);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(x, y, width, height);
	}

	public void tick(Physics p) {
		p.tick();
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public java.awt.Rectangle getBounds() {
		return new java.awt.Rectangle(x, y, width, height);
	}

	@Override
	public Sprite getSprite() {
		return sprite;
	}

}
