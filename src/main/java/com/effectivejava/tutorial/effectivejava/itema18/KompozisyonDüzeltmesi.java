package com.effectivejava.tutorial.effectivejava.itema18;

import java.util.HashSet;
import java.util.Set;

import com.effectivejava.tutorial.effectivejava.itema1011.Point;

public class KompozisyonDüzeltmesi {
	
	private static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		
        set.add("Kötü");
        set.forEach(System.out::println);
        
        
    }

}
