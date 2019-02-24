package com.jnngl.library.util.vectors;

import com.jnngl.library.util.vectors.basement.VectorBase;

public class Vector1j extends VectorBase {

	public Vector1j(float x) {
		super(x, 0, 0);
	}
	
	public Vector1j() {
		super(0, 0, 0);
	}
	
	public Vector1j(float position[]) {
		super(position[0], 0, 0);
	}
	
}
