package com.jnngl.library.xml;

import com.jnngl.library.handlers.FileHandler;

public class XmlManger {
	
	private static XmlListener xmllistener;

	public static void addXmlListener(XmlListener xmll) {
		xmllistener = xmll;
	}
	
	public static void init() {
		xmllistener.readXML(new FileHandler());
		xmllistener.writeXML(new FileHandler());
	}
	
}
