package com.effectivejava.tutorial.effectivejava.item5;

public class Sözlük {
	
	private String dil;
	
	public Sözlük(String dil) {
		// TODO Auto-generated constructor stub
		this.dil = dil;
	}
	
	public static Boolean isValid()
	{
		return true;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dil;
	}

}
