package com.jnngl.library.renderer.gradle;

import com.jnngl.library.messaging.Message;

public class Gradle {
	
	public String getMessage() {
		return new Message().writeUTFMessage("Gradle Build Message V0.1").readAndDestroyUTF();
	}
	
}
