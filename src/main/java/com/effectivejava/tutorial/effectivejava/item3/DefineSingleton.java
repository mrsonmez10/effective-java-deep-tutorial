package com.effectivejava.tutorial.effectivejava.item3;

public class DefineSingleton {
	
	public static DefineSingleton ds = new DefineSingleton();
	
	private DefineSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static DefineSingleton getInstance()
	{
		return ds;
	}
	
	

}
