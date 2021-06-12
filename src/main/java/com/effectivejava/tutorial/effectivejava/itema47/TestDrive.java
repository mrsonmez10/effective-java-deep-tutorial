package com.effectivejava.tutorial.effectivejava.itema47;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class TestDrive {
	
	public static void main(String[] args) {
		

		// # Stream
		// readAllLines (Lazy) +1
		// Çok yüklü bir şey döneceksen! infinite +1
		// Esneklik ve fonksiyonel ihtiyaç +1

		
		// # Collections
		// (Eager) +1
		// Belirli bir format (TreeSet) +1
		// Aynı Streamı 2 kere okuyamazsın! +1
		
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4);
		System.out.println(numbers.count());
		//System.out.println(numbers.count());
		//numbers.forEach(System.out::print);
		
		//numbers.forEach(System.out::print);
		// Modifiye edilebilir.(Add-remove vs..) 
		
		

	
		
	}

}
