package com.effectivejava.tutorial.effectivejava.itema18;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

	public static void main(String[] args) {
		
		
		KötüBirKalıtımÖrneği kötü =  new KötüBirKalıtımÖrneği();
		
		
		
		Kitap kitap1 = new Kitap("Amerikan Sapığı");
		Kitap kitap2 = new Kitap("Körlük");

		List<Kitap> kitapListesi = new ArrayList<Kitap>();

		kitapListesi.add(kitap1);
		kitapListesi.add(kitap2);

		Kütüphane kütüphane = new Kütüphane(kitapListesi);

		List<Kitap> kütüphanedekiKitaplar = kütüphane.kütüphanedekiTümKitaplar();

		for (Kitap kitap : kütüphanedekiKitaplar) 
		{
			System.out.println(kitap.getIsim());
		}

	}

}
