package com.effectivejava.tutorial.effectivejava.itema78;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class StopThread4 {
	
	private static AtomicBoolean stopRequested = new AtomicBoolean(false);
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!stopRequested.get())
				i++;
		});
		backgroundThread.start();

		TimeUnit.SECONDS.sleep(1);
		stopRequested.set(true);
	}
	
}