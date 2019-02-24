package com.jnngl.library.capture;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Screenshot {
	
	Robot robot;
	Rectangle screenSize;
	BufferedImage image;
	
	public void createScreenshot(String path, String format) throws AWTException, IOException {
		robot = new Robot();
		screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		image = robot.createScreenCapture(screenSize);
		ImageIO.write(image, format, new File(path));
	}
	
	public BufferedImage getScreenImage() throws AWTException {
		robot = new Robot();
		screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		image = robot.createScreenCapture(screenSize);
		return image;
	}
	
	public void createScreenshot(String path, String format, Rectangle size) throws AWTException, IOException {
		robot = new Robot();
		screenSize = size;
		image = robot.createScreenCapture(screenSize);
		ImageIO.write(image, format, new File(path));
	}
	
	public BufferedImage getScreenImage(Rectangle size) throws AWTException {
		robot = new Robot();
		screenSize = size;
		image = robot.createScreenCapture(screenSize);
		return image;
	}
	
}
