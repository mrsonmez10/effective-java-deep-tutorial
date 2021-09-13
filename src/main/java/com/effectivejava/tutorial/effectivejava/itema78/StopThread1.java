package com.effectivejava.tutorial.effectivejava.itema78;

import java.util.concurrent.TimeUnit;

//Broken! - How long would you expect this program to run?  (Page 312)
public class StopThread1 {
	
	private static boolean stopRequested;

	public static void main(String[] args) throws InterruptedException {
		
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!stopRequested)
				i++;
		});
		backgroundThread.start();

		TimeUnit.SECONDS.sleep(1); // Change and try
		stopRequested = true;
	}
	
}
