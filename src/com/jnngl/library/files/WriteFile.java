package com.jnngl.library.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void writeFile(String text, String file) throws IOException {
		
		File totalfile = new File(file);
		
		if(totalfile.exists()) {
			System.out.println("The file is already exists!");
		} else {
			totalfile.createNewFile();
			FileWriter filew = new FileWriter(totalfile);
			BufferedWriter bw = new BufferedWriter(filew);
			bw.write(text);
			bw.close();
			System.out.println("file writen!");
		}
		
	}
	
}
