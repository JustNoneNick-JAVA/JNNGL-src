package com.jnngl.library.util.vectors;

import com.jnngl.library.util.vectors.basement.VectorBase;

public class Vector2i extends VectorBase {
	
	@SuppressWarnings("unused")
	private float x, y, z;

	public Vector2i() {
		super(0, 0, 0);
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vector2i(float x, float y) {
		super(x, y, 0);
	}
	
	public Vector2i(float position[]) {
		super(position[0], position[1], 0);
	}
	
}
