package com.effectivejava.tutorial.effectivejava.itema30;

import java.util.*;

//Generic union method and program to exercise it  (Pages 135-6)
public class Union {

	// Generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		
		Set<E> result = new HashSet<>(s1);
		
		result.addAll(s2);
		
		return result;
	}
	

	// access modifier <conventionlar> dönüşTipi method_name(parameters..)
	
	
	public static <T extends Number> int topla(T değer1, T değer2)
	{
		return değer1.intValue() + değer2.intValue();
	}
	

	
	// Simple program to exercise generic method
	public static void main(String[] args) {
		
		Set<String> fenerbahce = Set.of("Uğur Boral", "Caner", "Pelkas");
		Set<String> Türkiye = Set.of("Uğur Boral", "Hasan Şaş", "Burak", "Rüştü");	
		
		
		
		Set<String> birleşim = union(fenerbahce, Türkiye);
		
		System.out.println(birleşim);
		
		
		topla(44.4, 12);
		

	}
	
}