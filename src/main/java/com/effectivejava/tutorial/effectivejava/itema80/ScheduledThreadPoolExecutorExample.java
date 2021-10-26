package com.effectivejava.tutorial.effectivejava.itema80;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
 
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;
 
public class ScheduledThreadPoolExecutorExample {
 
    private static class DataCollector implements Runnable {
 
        private static int nth = 0;
 
        private final int id = ++nth;
 
        @Override
        public void run() {
            System.out.printf("DataCollector %d collecting data...%n", id);
            try {
                MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                // ignore
            }
            System.out.println(Thread.currentThread().getName() + "@@@" );
            System.out.printf("DataCollector %d finished.%n", id);
        }
        
    }
 
    public static void main(String[] args) throws InterruptedException {
    	

    	// wait for activity here	
        int nThreads = 3;
        System.out.printf("Starting Scheduled Thread Pool of %d threads%n", nThreads);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(nThreads);
        for (int i = 1; i <= 8; ++i) {
            executor.scheduleWithFixedDelay(new DataCollector(), 100, 800, MILLISECONDS);
            //executor.scheduleAtFixedRate(new DataCollector(), 100, 800, MILLISECONDS);
        }
        SECONDS.sleep(3);
        executor.shutdown();

    }
    
}

