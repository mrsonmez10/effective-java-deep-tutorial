package com.effectivejava.tutorial.effectivejava.itema41;

public class SonTest {
	
	public static boolean kaydet(Object obj) 
	{
		if ((obj instanceof Kaliteli)) 
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Ajdar a = new Ajdar();
		Metallica m = new Metallica();
		Pentegram p = new Pentegram();
		
		System.out.println(kaydet(p));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Sadece bu işaretçiye sahip olan nesneleri kabul edecek metotlar yazmam gerekir mi?
		
	}
	
}
