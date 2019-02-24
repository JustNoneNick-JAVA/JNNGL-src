package com.jnngl.library.virtual_objects;

import java.util.Stack;

public class AbstractGetter<AbstractClass> {
	
	private Stack<AbstractClass> AClass = new Stack<AbstractClass>();
	
	public AbstractClass getAbstractClass() {
		return AClass.peek();
	}
	
	@SuppressWarnings("rawtypes")
	public Stack getStructure() {
		return AClass;
	}
	
	public boolean ClassEquals(Object obj) {
		boolean b = AClass.peek().equals(obj);
		return b;
	}
	
}
