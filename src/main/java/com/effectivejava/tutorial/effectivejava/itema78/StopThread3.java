package com.effectivejava.tutorial.effectivejava.itema78;

import java.util.concurrent.*;

//Cooperative thread termination with a volatile field
public class StopThread3 {
	
	private static volatile boolean stopRequested;

	public static void main(String[] args) throws InterruptedException {
		
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!stopRequested)
				i++;
		});
		backgroundThread.start();

		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}
	
}