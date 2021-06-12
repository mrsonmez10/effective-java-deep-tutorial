package com.effectivejava.tutorial.effectivejava.itema39.annotationwithparameter;

import java.util.*;

//Program containing annotations with a parameter (Page 183)
public class Sample2 {
	
	@ExceptionTest(ArithmeticException.class)
	public static void m1() { // Test should pass
		int i = 0;
		i = i / i;
	}

	@ExceptionTest(ArithmeticException.class)
	public static void m2() { // Should fail (wrong exception)
		int[] a = new int[0];
		int i = a[1];
	}

	@ExceptionTest(ArithmeticException.class)
	public static void m3() {
	} // Should fail (no exception)
	
}