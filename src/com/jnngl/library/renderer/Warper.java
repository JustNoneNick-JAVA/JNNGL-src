package com.jnngl.library.renderer;

import java.awt.Canvas;

import com.jnngl.library.display.ApplicationListener;

@SuppressWarnings("serial")
public class Warper extends Canvas {
	
	private static ApplicationListener app;
	private static boolean run = true;

	public static void start(ApplicationListener a) throws InterruptedException {
		init();
		app = a;
		Thread.sleep(100000);
		isTick();
	}
	
	private static void init() {
		
	}
	
	private static void isTick() throws InterruptedException {
		run = true;
		while(run) {
			app.update();
		}
		Thread.sleep(10);
		isTick();
	}
	
}
