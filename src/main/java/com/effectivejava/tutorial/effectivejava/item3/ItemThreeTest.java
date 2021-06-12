package com.effectivejava.tutorial.effectivejava.item3;

public class ItemThreeTest {
	
	public static void main(String[] args) {
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			
				System.out.println("HashCode of LazyCache: " + LazyCache.getInstance());
				System.out.println("HashCode of EagerCache: " + EagerCache.getInstance());
				System.out.println("HashCode of CacheSingleton: " + CacheSingleton.INSTANCE.hashCode());
												
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("HashCode of LazyCache: " + LazyCache.getInstance());
				System.out.println("HashCode of EagerCache: " + EagerCache.getInstance());
				System.out.println("HashCode of CacheSingleton: " + CacheSingleton.INSTANCE.hashCode());
				
			}
		}).start();
	}

}
