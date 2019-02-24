package com.jnngl.library.images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageWriter {
	
	public void writeImage(BufferedImage bi, String format, String name) throws IOException {
		File file = new File(name + "." + format);
		ImageIO.write(bi, format, file);
	}
	
}
