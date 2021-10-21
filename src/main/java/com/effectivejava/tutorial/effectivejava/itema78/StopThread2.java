package com.effectivejava.tutorial.effectivejava.itema78;

import java.util.concurrent.*;

//Properly synchronized cooperative thread termination
public class StopThread2 {
	
	private static boolean stopRequested;

	private static synchronized void requestStop() {
		stopRequested = true;
	}

	private static synchronized boolean stopRequested() {
		return stopRequested;
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!stopRequested())
				i++;
		});
		backgroundThread.start();

		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}
	
}
