package com.jnngl.library.less;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Doubless {
	
	public double classToDouble(@SuppressWarnings("rawtypes") Class s) {
		return s.getName().chars().average().getAsDouble();
	}
	
	public double stringToDouble(String s) {
		return s.chars().average().getAsDouble();
	}
	
	public double charsToDouble(IntStream c) {
		return c.average().getAsDouble();
	}
	
	public double OptionalDoubleToDouble(OptionalDouble od) {
		return od.getAsDouble();
	}
	
}
