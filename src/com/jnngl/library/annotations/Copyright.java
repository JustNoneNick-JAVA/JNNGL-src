package com.jnngl.library.annotations;

import static java.lang.annotation.ElementType.PACKAGE;

import java.lang.annotation.Target;

@Target(PACKAGE)
public @interface Copyright {

	String value(); 
	
}
