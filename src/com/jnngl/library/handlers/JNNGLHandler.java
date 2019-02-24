package com.jnngl.library.handlers;

import java.awt.Graphics;

import com.jnngl.library.display.ApplicationListener;
import com.jnngl.library.timers.NNApplication;

public class JNNGLHandler {
	
	@SuppressWarnings("serial")
	public ApplicationListener getApplicationListener() {
		return new ApplicationListener() {

			@Override
			public void paint(Graphics g) {
				
			}

			@Override
			public void update() {
				
			}

			@Override
			public void create() {
				
			}
			
		};
	}
	
	public NNApplication getApplication() {
		return new NNApplication() {

			@Override
			public Object init() {
				return null;
			}

			@Override
			public void Running() {
				
			}
			
		};
	}
	
	public Object getInit() {
		return new NNApplication() {

			@Override
			public Object init() {
				return null;
			}

			@Override
			public void Running() {
				
			}
			
		}.getNNApplicationFromMain().init();
	}
	
}
