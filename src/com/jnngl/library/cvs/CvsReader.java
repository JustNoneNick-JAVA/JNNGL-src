package com.jnngl.library.cvs;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CvsReader {
	
	public String readCVS(String file) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(file));
		for(String line : lines) {
			line = line.replace("\"", "");
			String[] result = line.split("");
			for(String s : result) {
				return s; 
			}
		}
		return "";
	}
	
}
