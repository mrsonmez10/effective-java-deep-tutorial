package com.effectivejava.tutorial.effectivejava.itema80;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class CachedThreadPoolExecutorExample {

	private static class Counter implements Runnable {
 
        private static int nth = 0;
 
        private final int id = ++nth;
        private final int number;
 
        public Counter(int number) {
            this.number = number;
        }
 
        @Override
        public void run() {
            System.out.println("Starting counter: " + id);
            for (int i = 0; i < number; ++i) {
                try {
                    MILLISECONDS.sleep(300);
                } catch (InterruptedException e) {
                    // ignore
                }
                System.out.println(Thread.currentThread().getName() + "@@@@");
                System.out.printf("counter %d, value: %d%n", id, i);
            }
            System.out.println("Finishing counter: " + id);
        }
        
    }

	public static void main(String[] args) {
		
        System.out.println("Starting Cached Thread Pool");
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 4; ++i) {
            executor.execute(new Counter(3));
        }
        executor.shutdown();
    }
	
}