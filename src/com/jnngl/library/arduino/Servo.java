package com.jnngl.library.arduino;

import java.io.IOException;

import com.jnngl.library.files.ReadFile;
import com.jnngl.library.files.WriteFile;

public final class Servo {
	
	public static void write(int i) throws IOException {
		WriteFile.writeFile(ReadFile.readFile("arduino.ardu") + "\nardu:set" + i, "aurduino.ardu");
	}
	
	public void reset() throws IOException {
		WriteFile.writeFile(ReadFile.readFile("arduino.ardu") + "\n" + "ardu:reset", "aurduino.ardu");
	}
	
	/**WARNING! DELAY INFLUENCES TO PROJECT!
	 * @throws InterruptedException */
	public void delayAll(long milliseonds) throws InterruptedException {
		Thread.sleep(milliseonds);
	}
	
	public static void delayArdu(long millis) throws InterruptedException {
		new Servo().wait(millis);
	}
	
}
