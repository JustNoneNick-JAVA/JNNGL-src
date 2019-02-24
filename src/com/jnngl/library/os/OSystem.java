package com.jnngl.library.os;

import java.io.IOException;

import com.jnngl.library.files.ReadFile;
import com.jnngl.library.files.WriteFile;

public final class OSystem {
	
	private int os;
	private String filetext;

	private OSystem(int os) {
		this.NotUsed(os);
	}
	
	public void download(OsInstallationConfiguration osic) throws IOException {
		String file = osic.getUrl();
		String text = ReadFile.readFile(file);
		filetext = text;
	}
	
	public void save(String file) throws IOException {
		WriteFile.writeFile(filetext, file);
	}
	
	public OSystem getOS(String os) {
		OSystem sys = null;
		if(os == "Windows") {
			sys = new OSystem(0);
		}
		if(os == "Linux") {
			sys = new OSystem(1);
		}
		if(os == "OS X" || os == "MacOS") {
			sys = new OSystem(2);
		}
		
		return sys;
	}

	public int getOsId() {
		return os;
	}

	private void NotUsed(int os) {
		this.os = os;
	}
	
}
