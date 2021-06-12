package com.effectivejava.tutorial.effectivejava.item1;

public class Fenerbahce {
	
	private String yeniFutbolcu;
	private int age;
	
	public Fenerbahce(String yeniFutbolcu, int age) {
		// TODO Auto-generated constructor stub
		this.yeniFutbolcu = yeniFutbolcu;
		this.age = age;
	}
	
	public Fenerbahce(String yeniTeknikDirektor) {
		// TODO Auto-generated constructor stub
		this.yeniFutbolcu = yeniFutbolcu;
	}
	
	
	public static Fenerbahce yeniFutbolcuUret(String yeniFutbolcu)
	{
		return new Fenerbahce(yeniFutbolcu, 22);
	}
	
	

	
	

}
