package com.jnngl.library.display;

import java.awt.Graphics;
import java.util.Stack;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class ApplicationListener extends JPanel implements Runnable {
	
	public static void run(ApplicationListener ap) {
		Thread thread = new Thread(getApplicationListener(ap));
		thread.start();
	}
	
	private static ApplicationListener getApplicationListener(ApplicationListener ap) {
		Stack<ApplicationListener> l = new Stack<ApplicationListener>();
		l.push(ap);
		return l.pop();
	}

	public abstract void paint(Graphics g);
	public abstract void update();
	public abstract void create();
	
	public static void setApp(ApplicationListener j) {
		Display.getWindow().add(j);
	}
	
	public static void setToDrawMhetod(ApplicationListener j, Graphics g) {
		j.paint(g);
		Screen.App = j;
	}
	
	public void run() {
		create();
		while(true) {
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			update();
		}
	}
	
}
