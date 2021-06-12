package com.effectivejava.tutorial.effectivejava.itema45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestDrive {
	
	public static void main(String[] args) {
		
		// Stream nedir? -> Java8 + sıralı paralel toplu işlemleri kolaylaştırmak için gelmiştir.
		/*
		 * collections, files, veya başka streamler kaynak olabilir.
		 * 
		 * terminal - intermediate
		 */
		
		List<String> myList = Arrays.asList("jose saramago", "stefan zweig", "tess gerritsen","selami");

		
		myList
			.stream()
			.filter(s -> s.startsWith("s"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
			
//		stream()
//	    .intemediateOperation1()
//	    .intemediateOperation2()
//	    ...
//	    .intemediateOperationN()
//	    .terminalOperation();
		
		
		Arrays.stream(new int[] {1, 2})
		   	.map(n -> 2 * n + 1)
		    .average()
		    .ifPresent(System.out::println);  
		
		
		
		for(int i = 0 ; i < 5 ; i++)
		{
			 System.out.println(i);
		}
		
		IntStream.range(0,5).forEach(System.out::println);
		
		System.out.println(IntStream.range(0,10).max().getAsInt());
		
		
		Collection<Integer> a = Collections.emptyList();
		a.add(10);
		List<Integer> result = a.stream().
		     filter(s -> s > 0).
		     collect(Collectors.toList());
		
	}

}
 