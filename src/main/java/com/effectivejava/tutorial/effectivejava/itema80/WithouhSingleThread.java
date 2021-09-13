package com.effectivejava.tutorial.effectivejava.itema80;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class WithouhSingleThread {
	
	private static int nth = 0;
	  
    private final int id = ++nth;
	private final int speed;
	
	public WithouhSingleThread() {
		// TODO Auto-generated constructor stub
		this.speed = new Random().nextInt(99) + 1;
	}
	
	public void run()
	{
		System.out.println("Starting printer work: " + id);
		 for (int i = 0; i <= 100; i += speed) {
             try {
                 MILLISECONDS.sleep(300);
             } catch (InterruptedException e) {
                 // ignore
             }
             System.out.printf("worker %d, done %d%%%n", id, i);
         }
         System.out.println("Done PrinterJob: " + id);
     }
	
	
	

	public static void main(String[] args) {

		System.out.println("Starting Single Thread Executor");
		WithouhSingleThread wt = new WithouhSingleThread();
		for (int i = 0; i < 5; ++i) 
		{		
			wt.run();
		}
		System.out.println();

	}

}
