package com.effectivejava.tutorial.effectivejava.itema14;

import java.util.ArrayList;
import java.util.Collections;

public class ItemFourteenTest {
	
	public static void main(String[] args) {

		ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();
		
		kitapListesi.add(new Kitap("Şibumi", 500));
		kitapListesi.add(new Kitap("Otomatik Portakal", 200));
		kitapListesi.add(new Kitap("Ab", 200));
		
		Collections.sort(kitapListesi);
		
		System.out.println("Sıralama1");
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
		// Sıralama 2
		System.out.println("Sıralama2");
		IsımKıyaslama ismeGöre = new IsımKıyaslama();
		Collections.sort(kitapListesi, ismeGöre);
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
			
	}

}
