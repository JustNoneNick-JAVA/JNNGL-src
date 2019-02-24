package com.jnngl.library.realese;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.jnngl.library.multiscene.Gsm;

@SuppressWarnings("serial")
public class MainStateDrawer extends JPanel implements Runnable {

	private boolean run = false;
	
	Gsm gsm = new Gsm();
	
	public MainStateDrawer() {
		run = true;
		gsm.setState(new MainScene(gsm));
		run();
	}
	
	@Override
	public void run() {
		while(run) {
			repaint();
			update();
			handleInput();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		gsm.render(g);
	}
	
	public void update() {
		gsm.update();
	}
	
	public void handleInput() {
		gsm.handleInput();
	}
	
}
