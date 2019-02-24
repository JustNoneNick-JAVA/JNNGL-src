package com.jnngl.library.util.vectors;

import com.jnngl.library.util.vectors.basement.VectorBase;

public class Vector1i extends VectorBase {
	
	public Vector1i(float x) {
		super(x, 0, 0);
	}
	
	public Vector1i() {
		super(0, 0, 0);
	}
	
	public Vector1i(float position[]) {
		super(position[0], 0, 0);
	}
	
}
