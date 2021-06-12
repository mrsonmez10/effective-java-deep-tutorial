package com.effectivejava.tutorial.effectivejava.itema50;

import java.util.Date;

public class TestDrive {
	
	public static void main(String[] args) {
		
		// immutable
//		String isim = "furkan";
//		System.out.println(isim.toUpperCase());
//		System.out.println(isim);
		
		// Date
		Date tarih = new Date();
		System.out.println(tarih);
		tarih.setYear(123721);
		System.out.println(tarih);

	}

}
