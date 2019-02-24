package com.jnngl.library.util.time;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class UtilTimer {
	
	Timer timer = new Timer();
	
	public void scheduleAtFixedRate(TimerTask tt, long d, long p) {
		timer.scheduleAtFixedRate(tt, d, p);
	}
	
	public void schedule(TimerTask tt, long d, long p) {
		timer.schedule(tt, d, p);
	}
	
	public void schedule(TimerTask tt, Date d) {
		timer.schedule(tt, d);
	}
	
	public void schedule(TimerTask tt, Date d, long p) {
		timer.schedule(tt, d, p);
	}
	
	public void cancel() {
		timer.cancel();
	}
	
}
