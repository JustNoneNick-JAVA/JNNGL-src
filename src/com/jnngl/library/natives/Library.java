package com.jnngl.library.natives;

import java.io.File;

public class Library {
	
	public static String lib;
	
	private Library(String lib) {
		Library.lib = lib;
	}
	
	public static Library fileToLibrary(File file) {
		return new Library(file.getAbsolutePath());
	}
	
	public native String library();
	
	public String getLibraryPath() {
		return lib;
	}
	
}
