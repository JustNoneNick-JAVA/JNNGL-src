package com.jnngl.library.xml;

import com.jnngl.library.handlers.FileHandler;

/**
 * 
 * @author nonen
 *
 */
public interface XmlListener {
	
	FileHandler handler = new FileHandler();
	
	/**
	 * @return 
	 * @return FileHandler
	 */
	public default FileHandler getFileHandler() {
		return handler;
	}
	
	public abstract void readXML(FileHandler handler);
	
	public abstract void writeXML(FileHandler handler);
	
	public default void loadXML(String file) {
		FileHandler.loadFile(file);
	}
	
}
