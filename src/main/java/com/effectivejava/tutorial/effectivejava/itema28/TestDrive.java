package com.effectivejava.tutorial.effectivejava.itema28;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
	
	
	public static void main(String[] args) {
		
		// 1
		
		// Crash at Runtime!
		// Arraydeki hataları derleme anında fark edemiyoruz
		Object[] objectArray = new Long[1];
		objectArray[0] = "asd"; // ArrayStoreException -
		
		
	
		
		// 2
		List<Long> ol = new ArrayList<Long>(); // Uyumsuz türler
		ol.add(1L);
		

		
		
		// 3
		
		/*
		 *  Arrayler ve listeler birbirleriyle uyumlu değildirler.
		 *  Dizilerlde run time da tip kontrolü yapılıyor
		 *  Listede ise derleme esnasında bundan dolayı aşağıdaki tanımı yapamayız.
		 */
		
		// List<String>[] stringLists = new List<String>[1]; 

		
		
		/*
		 * Özet
		 * 
		 * Diziler -> Run timeda tür güvenliği var ama derleme esnasında yok
		 * Generic -> tam tersi
		 */
	
	}

}
