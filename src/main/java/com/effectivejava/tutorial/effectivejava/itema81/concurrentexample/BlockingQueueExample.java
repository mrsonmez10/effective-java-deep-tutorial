package com.effectivejava.tutorial.effectivejava.itema81.concurrentexample;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

	static class Producer {
		
		BlockingQueue<Integer> queue;
		Random random = new Random();

		public Producer(BlockingQueue<Integer> queue) {
			this.queue = queue;
		}

		void produce() {
			while (true) {
				try {
					queue.put(random.nextInt(100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Yeni sayı üretildi dizi boyutu :  " + queue.size());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	static class Consumer {

		BlockingQueue<Integer> queue;

		public Consumer(BlockingQueue<Integer> queue) {
			this.queue = queue;
		}

		public void consume() {
			while (true) {
				try 
				{
					Thread.sleep(3000);
					System.out.println(queue.take() + " sayısı kuyruktan çıkarıldı  dizi boyutu " + queue.size());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		Thread thProduce = new Thread(new Runnable() {
			@Override
			public void run() {
				producer.produce();
			}
		});

		Thread thConsume = new Thread(new Runnable() {
			@Override
			public void run() {
				consumer.consume();
			}
		});
		
		thProduce.start();
		thConsume.start();

	}

}
