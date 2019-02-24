package com.jnngl.library.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JsonWriter {
	
	FileWriter file = null;
	JSONObject json = null;
	
	public JsonWriter(String file)  {
		try {
			this.file = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void write(String key, String value) {
		json = new JSONObject();
		json.put(key, value);
		
		try {
			file.write(json.toString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
