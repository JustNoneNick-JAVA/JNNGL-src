package com.jnngl.library.realese;

import java.awt.Color;
import java.awt.Graphics;

import com.jnngl.library.multiscene.Gsm;
import com.jnngl.library.multiscene.State;

public class MainScene extends State {

	protected MainScene(Gsm gsm) {
		super(gsm);
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000000000, 1000000000);
	}

	@Override
	public void update() {

	}

	@Override
	public void handleInput() {

	}

}
