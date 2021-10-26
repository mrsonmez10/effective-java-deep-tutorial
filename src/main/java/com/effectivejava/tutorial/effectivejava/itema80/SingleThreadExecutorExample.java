package com.effectivejava.tutorial.effectivejava.itema80;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class SingleThreadExecutorExample {

	private static class PrinterJob implements Runnable {
 
        private static int nth = 0;
 
        private final int id = ++nth;
        private final int speed;
 
        public PrinterJob() {
            // draw 0-99 and give +1 to progress at least by 1%:
            this.speed = new Random().nextInt(99) + 1;
        }
 
        @Override
        public void run() {
        	
            System.out.println("Starting printer work: " + id);
            for (int i = 0; i <= 100; i += speed) {
                try {
                    MILLISECONDS.sleep(300);
                } catch (InterruptedException e) {
                    // ignore
                }
                System.out.printf("worker %d, done %d%%%n", id, i);
            }
            System.out.println(Thread.currentThread().getName() + "@@@" ); // Bura
            System.out.println("Done PrinterJob: " + id);
        }
        
    }

	public static void main(String[] args) {
		
        System.out.println("Starting Single Thread Executor");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; ++i) {
            executor.execute(new PrinterJob());
        }
        executor.shutdown();
        
    }
	
}
