package com.effectivejava.tutorial.effectivejava.itema46;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestDrive {
	
	public static void main(String[] args) {
		
	      // Get the List
        List<String> g
            = Arrays.asList("Fender", "Ibanez", "Fender");
  
        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result = 
        		g.stream()
        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        Map<String, Long> result2 = 
        		g.stream()
        		.collect(Collectors.groupingBy(String::toLowerCase, counting()));
        
        
        // Print the result
        System.out.println(result);
        System.out.println(result2);
        
	}

}
