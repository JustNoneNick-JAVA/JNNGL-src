package com.jnngl.library.initialization;

import com.jnngl.library.sounds.Sound;

public class SoundInitializer {
	
	public static void init() {
		if(Sound.loadSound(Sound.file).isRunning() == true) {
			return;
		}
		Sound.play();
	}
	
}
