package com.jnngl.library.objects;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.jnngl.library.images.Sprite;
import com.jnngl.library.orentation.Type;

public abstract class MapObject {
	
	public int x;
	public int y;
	protected static int width;
	protected static int height;
	protected int speed;
	protected int dx;
	protected int dy;
	protected boolean left = false, right = false, down = false, up = false;
	protected static final Sprite sprite = new Sprite();
	protected static Type type;
	
	public MapObject(Type id) {
		MapObject.type = id;
	}
	
	public abstract void draw(Graphics g);
	public abstract void update();
	public abstract Rectangle getBounds();
	
	public abstract Sprite getSprite();
	
	public void tick() {
		dx = speed;
		dy = speed;
		if(left) {
			x -= dx;
		}
		if(right) {
			x += dx;
		}
		if(down) {
			y += dy;
		}
		if(up) {
			y -= dy;
		}
		dx = 0;
		dy = 0;
	}

	protected int getX() {
		return x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	protected int getWidth() {
		return width;
	}

	@SuppressWarnings("static-access")
	protected void setWidth(int width) {
		this.width = width;
	}

	protected int getHeight() {
		return height;
	}

	@SuppressWarnings("static-access")
	protected void setHeight(int height) {
		this.height = height;
	}

	protected int getSpeed() {
		return speed;
	}

	protected void setSpeed(int speed) {
		this.speed = speed;
	}

	protected int getDx() {
		return dx;
	}

	protected void setDx(int dx) {
		this.dx = dx;
	}

	protected int getDy() {
		return dy;
	}

	protected void setDy(int dy) {
		this.dy = dy;
	}

	protected boolean isLeft() {
		return left;
	}

	protected void setLeft(boolean left) {
		this.left = left;
	}

	protected boolean isRight() {
		return right;
	}

	protected void setRight(boolean right) {
		this.right = right;
	}

	protected boolean isDown() {
		return down;
	}

	protected void setDown(boolean down) {
		this.down = down;
	}

	protected boolean isUp() {
		return up;
	}

	protected void setUp(boolean up) {
		this.up = up;
	}

	public Type getID() {
		return type;
	}
	
}
