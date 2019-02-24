package com.jnngl.library.natives;

import java.lang.reflect.InvocationTargetException;

public class NativeLoader {
	
	public static void loadLibrary(Library lib) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
			System.load(lib.getLibraryPath());
			System.loadLibrary(lib.getLibraryPath());
			com.jnngl.library.system.System.prepare(System.class);
	}
	
}
