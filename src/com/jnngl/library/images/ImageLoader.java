package com.jnngl.library.images;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	private static Image img;

	public static void loadImage(String path) throws IOException {
		
		img = ImageIO.read(new File(path));
		
	}
	
	public static Image loadImageAndGet(String path) throws IOException {
		
		Image temp_img = ImageIO.read(new File(path));
		return temp_img;
		
	}
	
public static void loadImageFromUrl(String url) throws IOException {
		
		img = ImageIO.read(new URL(url));
		
	}
	
	public static Image loadImageFromUrlAndGet(String url) throws IOException {
		
		Image temp_img = ImageIO.read(new URL(url));
		return temp_img;
		
	}
	
	public void drawImage(Graphics g, int x, int y, int width, int height) {
		g.drawImage(img, x, y, width, height, null);
	}
	
	public Rectangle getImageBounds() {
		return new Rectangle(img.getWidth(null), img.getHeight(null));
	}
	
}
