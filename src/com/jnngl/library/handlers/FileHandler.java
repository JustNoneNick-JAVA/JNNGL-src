package com.jnngl.library.handlers;

import java.io.File;

public class FileHandler {
	
	static File mfile = new File("C:/unnamed.txt");
	
	/**
	 * @param file
	 */
	public static void loadFile(String file) {
		mfile = new File(file);
	}
	
	/**
	 * <h5>Category:</h5> FileLoader
	 * 
	 * 
	 * @return loaded file from memory
	 */
	public File getFile() {
		return mfile;
	}
	
}
