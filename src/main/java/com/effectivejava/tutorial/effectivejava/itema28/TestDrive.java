package com.effectivejava.tutorial.effectivejava.itema28;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
	
	
	public static void main(String[] args) {
		

//		Object[] objectArray = new Long[1];
//		objectArray[0] = true; 

		
//		List<Object> ol = new ArrayList<Long>(); // Uyumsuz türler.
//		ol.add(1L);
		
		
		/**
		 * Dizilerde Object[] -> Long[] 'un süper sınıfıdır.
		 * Ancak List<Object> -> List<String> arasında böyle bir bağlantı söz konusu olamaz. Generic bizi kurtarıyor!
		 * 
		 * Genericleri arraylere tercih etmek bizi kurtarır.
		 */
		
		
		// arrayler -> run time da tür güvenliği ancak derlemede sağlamaz
		// genericlerde bunun tam tersi geçerli.
		// Listleri tercih etmeliyiz.
		
	}

}
