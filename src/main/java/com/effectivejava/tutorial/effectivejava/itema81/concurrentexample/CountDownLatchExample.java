package com.effectivejava.tutorial.effectivejava.itema81.concurrentexample;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	static CountDownLatch latch = new CountDownLatch(3);
	
	static class Processor implements Runnable {
		
		int id;
		CountDownLatch latch;

		public Processor(int id, CountDownLatch latch) {
			this.id = id;
			this.latch = latch;
		}

		@Override
		public void run() {
			System.out.println("Thread " + String.valueOf(id) + " başladi ");
			try 
			{
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread " + String.valueOf(id) + " bitti ");
			latch.countDown();
			System.out.println("LatchCount: " + latch.getCount());

		}
	}

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 3; i++) 
		{
			executorService.submit(new Processor(i, latch));
		}
		try 
		{
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Bütün İşlemler Tamamlandı ");
		executorService.shutdown();

	}

}
