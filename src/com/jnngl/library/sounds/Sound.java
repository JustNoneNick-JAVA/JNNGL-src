package com.jnngl.library.sounds;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
	
	static Clip clip;
	static AudioInputStream ais;
	
	public static File file;
	
	public static Clip loadSound(File f) {
		try {
			clip = AudioSystem.getClip();
		} catch (LineUnavailableException e1) {
			e1.printStackTrace();
		}
		try {
			ais = AudioSystem.getAudioInputStream(f);
		} catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		}
		file = f;
		return clip;
	}
	
	public static void play() {
		clip.start();
	}
	
	public static void stop() {
		clip.stop();
	}
	
}
