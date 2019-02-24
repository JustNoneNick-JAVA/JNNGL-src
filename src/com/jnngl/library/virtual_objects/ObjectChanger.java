package com.jnngl.library.virtual_objects;

public class ObjectChanger<C> {
	
	private C Class;

	public C getObjectClass() {
		return Class;
	}

	public void Equals(C c) {
		Class = c;
	}
	
}
