package com.effectivejava.tutorial.effectivejava.itema81;

import java.util.concurrent.Semaphore;

public class TestDrive {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Common concurrent collections : ConcurrentHashMap, BlockingQueue
		 * Common synchronizers : CountdownLatch, Semaphore
		 */
		
		
		// ConcurrentHashMap
		/*
		 * ConcurrentHashMap, HashMap’in aksine birden fazla thread’in aynı anda map’e erişip en az birisinin 
		 * update işlemi yaptığı senaryolarda ek bir sekronizasyon yapısı gerektirmeden kullanılabilen bir veri yapısıdır.
		 *  Bu veri yapısının bütün metodları thread-safe’dir.
		 */
		
		// BlockingQueue
		
		
		// CountdownLatch
			// go with example
		
		
		// Semaphore
		/* Sem
		 * Limiting concurrent access to disk (as performance degrades due to competing disk seeks)
			Thread creation limiting
			JDBC connection pooling / limiting
			Network connection throttling
			Throttling CPU or memory intensive tasks
		 */
		/* Countdown
		 * Achieving Maximum Parallelism: Sometimes we want to start a number of threads at the same time to achieve maximum parallelism
			Wait N threads to completes before start execution
			Deadlock detection.
		 */
		
		Semaphore sem = new Semaphore(1);
		sem.acquire(); // Github örneğini göster
		
		
		
		
	}

}
