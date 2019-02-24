package com.jnngl.library.timers;

import java.awt.Graphics;

import com.jnngl.library.display.ApplicationListener;

public interface NNApplication {
	
public default NNApplication getNNApplicationFromMain() {
	return this;
	}
	
	public default void start() {
		new Runnable() {

			@Override
			public void run() {
				init();
				while(true) {
					Running();
				}
			}
			
		}.run();
	}
	
	public static void create(ApplicationListener al) {
		al.create();
	}
	
	public static void tick(ApplicationListener al) {
		al.update();
	}
	
	public static void paint(Graphics g, ApplicationListener al) {
		al.paint(g);
	}
	
	public abstract Object init();

	public abstract void Running();
	
}
