package practice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Control {
	private Lamp currentLamp;
	public Control()
	{
		currentLamp=Lamp.S2N;
		currentLamp.lighted();
		ScheduledExecutorService timer=Executors.newScheduledThreadPool(1);
		timer.scheduleAtFixedRate(new Runnable(){
			public void run()
			{
				System.out.println("µÆÇÐ»»");
				currentLamp=currentLamp.blacked();
			}
			
	
		}, 
		10, 
		10,
		TimeUnit.SECONDS);
	}
}
