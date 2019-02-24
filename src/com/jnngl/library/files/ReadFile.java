package com.jnngl.library.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	static FileReader fr;
	static BufferedReader br;
	
	public static String readLine(String file) throws IOException {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String line = br.readLine();
		return line;
	}
	
	@SuppressWarnings("resource")
	public static String readFile(String file) throws IOException {
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String text = "";
		String line = br.readLine(); 
		
		while(line != null) {
			text += line;
			line = br.readLine();
		}
		
		return text;
	}
	
}
