package com.jnngl.library.tts;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeach {
	
	private String voice;
	private Voice tts;
	
	public TextToSpeach(String voice) {
		this.voice = voice;
		tts = VoiceManager.getInstance().getVoice(this.voice);
		tts.allocate();
	}
	
	public void say(String text) {
		tts.setPitchShift(0);
		tts.speak(text);
	}
	
}
