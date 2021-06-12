package com.effectivejava.tutorial.effectivejava.itema46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

// Frequency table examples showing improper and proper use of stream (Page 210-11)
public class Freq {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\itema45\\anagrams\\words");
		
		// Uses the streams API but not the paradigm--Don't do this!
        Map<String, Long> freq2 = new HashMap<>();
        
        try (Stream<String> words = new Scanner(file).tokens()) 
        {
            words.forEach(word -> {
            	System.out.println("a");
                freq2.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }
        
        /*
         * forEach metodu sadece önceki hesaplamaları raporlamak için kullanılmalıdır, hesaplama yapmak için değil
         */
        
        System.out.println(freq2);
        System.out.println();

		// Proper use of streams to initialize a frequency table (
		Map<String, Long> freq;
		try (Stream<String> words = new Scanner(file).tokens()) 
		{
			freq = words.collect(groupingBy(String::toLowerCase, counting()));
		}

		System.out.println(freq);

		
		
		// toList, toSet, toMap, groupingBy, joining
		
		// Pipeline to get a top-ten list of words from a frequency table
		List<String> topTen = freq.keySet()
				.stream()
				.sorted(comparing(freq::get).reversed())
				.limit(10)
				.collect(toList());
		
		
		System.out.println();
		System.out.println(topTen);
		
	}
}
