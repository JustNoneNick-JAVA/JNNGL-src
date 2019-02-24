package com.jnngl.library.util.vectors.basement;

public abstract class VectorBase {
	
	private float x, y, z;

	public VectorBase(float x, float y, float z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	
	public VectorBase() {
		
	}
	
	public VectorBase(float position[]) {
		this.setX(position[1]);
		this.setY(position[2]);
		this.setZ(position[3]);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
}
