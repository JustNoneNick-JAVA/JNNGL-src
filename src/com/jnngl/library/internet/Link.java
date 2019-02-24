package com.jnngl.library.internet;

import java.net.MalformedURLException;
import java.net.URL;

public class Link {
	
	private static String url;
	private static URL urls;

	public Link(String url) throws MalformedURLException {
		URL urls = new URL(url);
		Link.urls = urls;
		Link.url = url;
	}

	public static String getUrl() {
		return url;
	}

	public static URL getUrls() {
		return urls;
	}
	
}
