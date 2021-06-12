package com.effectivejava.tutorial.effectivejava.itema1011;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ItemTenTest {
	
	public static void main(String[] args) {

		// Part1

//		// integer-type
//		System.out.println(10 == 20);
//		// char-type
//		System.out.println('a' == 'b');
//		// char and double type
//		System.out.println('a' == 97.0); 
//		// boolean type
//		System.out.println(true == true);
//
//		System.out.println((int) 'a'); // cast char to int
//		System.out.println('a' == 97); // char is automatically promoted to int
//		System.out.println('a' + 1); // char is automatically promoted to int
//		System.out.println((char) 98); // cast int to char
//		
//		DenemeSınıf d = new DenemeSınıf(1, 2);
//		DenemeSınıf d2 = new DenemeSınıf(1, 2);
//		System.out.println(d == d2);
//		System.out.println(d.equals(d));
//		
		
				
        // Part2
		
//        DenemeSınıf deneme = new DenemeSınıf(10, 11);
//        DenemeSınıf deneme2 = new DenemeSınıf(10, 11);
//        
//        if (deneme.equals(deneme2))
//        	System.out.println("Biz eşitiz");
//        else
//        	System.out.println("değiliz"); 
        
        
        // Part3
//        DenemeSınıfOvrd deneme3 = new DenemeSınıfOvrd(10, 11);
//        DenemeSınıfOvrd deneme4 = new DenemeSınıfOvrd(10, 11);
//        
//        if (deneme3.equals(deneme4))
//        	System.out.println("Biz eşitiz"); 
//        else
//        	System.out.println("değiliz"); 
//        
//        System.out.println(deneme4.equals(deneme3));
//        System.out.println(deneme3.equals(null));
//		
		
		
		
		// Part4
		/*
		reflexive: an object must equal itself x.equals(x)
		symmetric: x.equals(y) must return the same result as y.equals(x)
		transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
		consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
		null control a.equals(null)
		*/
		
		
		// Part 5 trs.
		
		
		
		
		// part 6
		
//		List<DenemeSınıfOvrd> list = new ArrayList<>();
//		DenemeSınıfOvrd e = new DenemeSınıfOvrd(1, 2);
//		list.add(e);
//		System.out.println(list.contains(new DenemeSınıfOvrd(1, 2)));
//		
//		
//		List<DenemeSınıf> list2 = new ArrayList<>();
//		DenemeSınıf r = new DenemeSınıf(3, 4);
//		list2.add(r);
//		System.out.println(list2.contains(new DenemeSınıf(3, 4)));

		
		
		
		
		// Part7
		
//		DenemeSınıfOvrd deneme1 = new DenemeSınıfOvrd(1, 2);
//		DenemeSınıfOvrd deneme2 = new DenemeSınıfOvrd(3, 4);
//		DenemeSınıfOvrd deneme3 = new DenemeSınıfOvrd(1, 2);
//		System.out.println(deneme1.hashCode());
//		System.out.println(deneme2.hashCode());
//		System.out.println(deneme3.hashCode());

		
		// Part7
//		Map<DenemeSınıfOvrd, String> m = new HashMap<>();
//		m.put(new DenemeSınıfOvrd(1, 2), "İlkEleman");
//		
//		
//		System.out.println(m.get(new DenemeSınıfOvrd(1, 2)));
	
	
	}
	
}
