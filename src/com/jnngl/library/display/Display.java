package com.jnngl.library.display;

import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;

import com.jnngl.library.exceptions.JNNGLException;

public class Display {
	
	public static boolean DRAW_SOURCE = false;
	private static JFrame f = new JFrame();
	
	private static int f_width, f_height;
	
	public static void setSettings(int width, int height, boolean resizable, boolean aot) {
		
		f.setSize(width, height);
		f.setResizable(resizable);
		f.setAlwaysOnTop(aot);
		
		f_width = width;
		f_height = height;
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		//f.add(new Screen());
		
		f.add(new Screen());
		
	}
	
	public static void setIconFromFile(String file) {
		f.setIconImage(Toolkit.getDefaultToolkit().getImage(file));
	}
	
	public static void setIconFromURL(String url) throws JNNGLException {
		try {
			f.setIconImage(Toolkit.getDefaultToolkit().getImage(new URL(url)));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public static void add(ApplicationListener comp) {
		f.add(comp);
	}
	
	public static JFrame getWindow() {
		return f;
	}
	
	public static void create() throws JNNGLException {
		
		setIconFromURL(
				"http://www.freeiconspng.com/uploads/microsoft-new-logo-simple-0.png"
				);
		f.setVisible(true);
		
	}
	
	public static int getWidth() {
		return f_width;
	}
	
	public static int getHeight() {
		return f_height;
	}
	
}
