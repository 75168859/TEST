package cn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Heart {
	
	private static TimerTask timerTask = null;
	
	public static void main(String[] args) {
		
		timerTask = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			}
		};
		
		Timer t = new Timer("Heartbeat");
	    t.schedule(timerTask, 2000L, 10000L);
	}
}
