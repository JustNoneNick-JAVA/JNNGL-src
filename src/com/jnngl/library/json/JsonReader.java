package com.jnngl.library.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jnngl.library.exceptions.JNNGLException;
import com.jnngl.library.exceptions.JNNGLFileException;

public class JsonReader {
	
	JSONParser parser = new JSONParser();
	JSONObject obj = null;
	
	public JsonReader(String file) throws JNNGLException, JNNGLFileException {
		
		try {
			Object object = parser.parse(new FileReader(file));
			obj = (JSONObject) object;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String get(String key) {
		String k = (String) obj.get(key);
		return k;
	}
	
}
