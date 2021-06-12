package com.effectivejava.tutorial.effectivejava.itema17;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.BitSet;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class TestDrive {
	
	
	public static void main(String[] args) {
		
		
		// Mutable Immutable Nedir?
		// Immutable
		String isim = new String("Furkan");
		System.out.println(isim.toLowerCase());
		System.out.println(isim);
		
		

		

		// Mutable
	    Date date = new Date();
	    System.out.println(date);
	 
	    date.setDate(7);
	    System.out.println(date);
	    
	    
    
//	    // immutable
//	 
	    LocalDate localDate = LocalDate.now();
	    System.out.println(localDate);
	 
	    System.out.println(localDate.plusDays(1));
	    System.out.println(localDate);

	    
	    
	    
	    
	    
	    // Static factory ile immutable örneği 
	    //Boolean
	    /*
	     * Bir sınıfı tasarlarken public yapıcı metotlar (constructor) yerine statik fabrika metotları kullanmak, 
	     * daha sonra istemcileri hiç etkilemeden önbellek (cache) eklemenize de olanak sağlar.
	     */
	    
	    
	    // Immutable kullanım avantajları arasında
	    	// map yapısında harika bir anahtar görevi görür mantıken hiç değişmediği için..
	    
	    
	    // Dezavantaj
		// Immutable objede yeni ufak bir değişiklik için yeni bir nesne yaratmak zorundayız
		// Ancak mutable için böyle bir zorunluluğa gerek yok.
		
	    BigInteger fact = new BigInteger("1");
	    System.out.println(fact);
	    fact = fact.flipBit(0);
	    System.out.println(fact);
//	    
	    BitSet bits1 = new BitSet(1);
	    System.out.println(bits1);
	    bits1.flip(0);
	    System.out.println(bits1);
//	    
//
//	    
//	    // dezavantaja çözüm
//	    // String builder
	    StringBuilder mutableString = new StringBuilder("Şimdi mutable olacak");
	    System.out.println(mutableString);
	    System.out.println(mutableString.hashCode());
//	    
//	    
	    mutableString.setCharAt(7, '@');
	    System.out.println(mutableString.toString());
	    System.out.println(mutableString.hashCode());
 
	    
	    
	    
	    
	    
	    
	    
	
	}
	
	
}
