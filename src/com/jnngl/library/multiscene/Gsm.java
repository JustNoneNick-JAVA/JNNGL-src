package com.jnngl.library.multiscene;

import java.awt.Graphics;
import java.util.Stack;

public class Gsm {
	
	Stack<State> state;
	
	public Gsm() {
		state = new Stack<State>();
	}
	
	public void pop() {
		state.pop();
	}
	
	public void push(State s) {
		state.push(s);
	}
	
	public void setState(State s) {
		pop();
		push(s);
	}
	
	public void render(Graphics g) {
		state.peek().render(g);
	}
	
	public void update() {
		state.peek().update();
	}
	
	public void handleInput() {
		state.peek().handleInput();
	}
	
}
