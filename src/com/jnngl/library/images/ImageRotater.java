package com.jnngl.library.images;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageRotater {
	
	public int x = 0, y = 0;
	
	private AffineTransform at;
	
	public void applyPosition() {
		 at = AffineTransform.getTranslateInstance(x, y);
	}
	
	public void rotate(int degres) {
		at.rotate(Math.toRadians(degres));
	}
	
	public void scale(double d) {
		at.scale(d, d);
	}
	
	public void invert() throws NoninvertibleTransformException {
		at.invert();
	}
	
	public void draw(Graphics g, BufferedImage img) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img, at, null);
	}
	
	public BufferedImage loadImage(String path) throws IOException {
		
		BufferedImage img = null;
		
		img = ImageIO.read(new File(path));
		return img;
		
	}
	
}
