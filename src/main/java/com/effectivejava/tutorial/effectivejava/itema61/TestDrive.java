package com.effectivejava.tutorial.effectivejava.itema61;

public class TestDrive {
	
	public static void main(String[] args) {	
		
		long sum = 0;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	
	/*
	 *  -> Primitives identity and values are the same. Boxed types have distinct identity values from what their value is.
		Primitives always have a value, boxed types also have the option of having null as a value.
		Primitives are more time and space efficient.
	 */

}
