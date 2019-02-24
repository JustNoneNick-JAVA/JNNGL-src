package com.jnngl.library.os;

import java.net.MalformedURLException;

import com.jnngl.library.internet.Link;

public class OsInstallationConfiguration {
	
	private String url;
	
	public void setDirectionalLink(Link link) throws MalformedURLException {
		String url = Link.getUrl();
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	
}
