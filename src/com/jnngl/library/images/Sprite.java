package com.jnngl.library.images;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Sprite {
	
	private ImageRotater ir = new ImageRotater();
	
	public static final ImageLoader load = new ImageLoader();
	
	private Image totalSprite = null;
	
	public void load(Image img, int x, int y, double scale) {
		ir.x = x;
		ir.y = y;
		ir.applyPosition();
		ir.scale(scale);
	}
	
	public void draw(Graphics g, int x, int y) {
		ir.draw(g, (BufferedImage) totalSprite);
	}
	
	public Image getTotalSpritePicture() {
		return totalSprite;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(totalSprite.getWidth(null), totalSprite.getHeight(null));
	}
	
	public int getWidth() {
		return totalSprite.getWidth(null);
	}
	
	public int getHeight() {
		return totalSprite.getHeight(null);
	}
	
}
