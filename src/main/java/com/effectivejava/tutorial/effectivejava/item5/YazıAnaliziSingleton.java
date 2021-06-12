package com.effectivejava.tutorial.effectivejava.item5;

public class YazıAnaliziSingleton {
	
	private final static Sözlük sözlük = new Sözlük("İngilizce");
	public static YazıAnaliziSingleton INSTANCE = new YazıAnaliziSingleton();
	
	private YazıAnaliziSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isValid()
	{
		return true;
	}

}
