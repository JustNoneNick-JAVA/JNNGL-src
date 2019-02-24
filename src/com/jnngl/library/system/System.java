package com.jnngl.library.system;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Stack;

import com.jnngl.library.natives.Library;

public class System {
	
	@SuppressWarnings("static-access")
	public static void prepare(@SuppressWarnings("rawtypes") Class s) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		@SuppressWarnings("unchecked")
		Class<System> sys = (Class<System>) s.getClassLoader().loadClass(java.lang.System.class.toString());
		Class<?> loader = new System().getClass();
		Constructor<?> systeml = loader.getConstructor(sys);
		java.lang.System system = (java.lang.System) systeml.newInstance(new System());
		Stack<java.lang.System> systemout = new Stack<java.lang.System>();
		if(system == null) {
			system = systemout.peek();
		}
		system.getClass().getName();
		system.runFinalization();
		system.out.println(s.toString());
		system.console().flush();
		system.getenv(Library.fileToLibrary(new File(Library.lib)).getLibraryPath());
	}
	
	public static java.lang.System getJavaLangSystem() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		@SuppressWarnings("unchecked")
		Class<System> sys = (Class<System>) System.class.getClassLoader().loadClass(java.lang.System.class.toString());
		Class<?> loader = new System().getClass();
		Constructor<?> systeml = loader.getConstructor(sys);
		java.lang.System system = (java.lang.System) systeml.newInstance(new System());
		Stack<java.lang.System> systemout = new Stack<java.lang.System>();
		if(system == null) {
			system = systemout.peek();
		}
		return system;
	}

}
