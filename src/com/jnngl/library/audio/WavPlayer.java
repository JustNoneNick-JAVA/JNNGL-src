package com.jnngl.library.audio;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class WavPlayer {
	
	static Clip clip;
	
	public static void setFile(String filename) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
		
		clip = AudioSystem.getClip();
		AudioInputStream ais = AudioSystem.getAudioInputStream(new File(filename));
		clip.open(ais);
		System.out.println("song is opened");
	}
	
	public static void play() {
		clip.start();
		System.out.println("song is play!");
	}
	
	public static void stop() {
		clip.stop();
		System.out.println("song is stoped");
	}
	
}
