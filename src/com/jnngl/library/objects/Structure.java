package com.jnngl.library.objects;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;

import com.jnngl.library.images.Sprite;
import com.jnngl.library.orentation.Type;

public class Structure extends MapObject {

	Image img;
	
	@SuppressWarnings("static-access")
	public Structure(Type type) throws IOException {
		super(type);
		img = sprite.load.loadImageFromUrlAndGet("http://theprovingground.wdfiles.com/local--files/usc-arch517-exercise1/USC_517_Exercise%201%20Space%20Truss.jpg");
		sprite.load(img, 0, 0, 0.5);
	}

	public void draw(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

	public void update() {

	}

	public Rectangle getBounds() {
		return new Rectangle(getWidth(), getHeight());
	}

	public Sprite getSprite() {
		return sprite;
	}

}
