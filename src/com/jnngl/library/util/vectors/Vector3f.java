package com.jnngl.library.util.vectors;

import com.jnngl.library.util.vectors.basement.VectorBase;

public class Vector3f extends VectorBase {
	
	public float x, y, z;
	
	public Vector3f(float x, float y, float z) {
		super(x, y, z);
	}
	
	public Vector3f() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vector3f(float position[]) {
		super(position[0], position[1], position[2]);
	}
	
}
