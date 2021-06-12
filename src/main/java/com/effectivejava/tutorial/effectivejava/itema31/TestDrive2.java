package com.effectivejava.tutorial.effectivejava.itema31;

import java.util.ArrayList;
import java.util.List;

public class TestDrive2 {
	
	public static void main(String[] args) {
		
		
		List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
		List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo5 = new ArrayList<Double>();  // Double extends Number
		
		// Reading
		// You can read a Number because any of the lists that could be assigned to foo3 contain a Number or a subclass of Number.
		// You can't read an Integer because foo3 could be pointing at a List<Double>.
		// You can't read a Double because foo3 could be pointing at a List<Integer>.
		
		
		// Writing
		// You can't add an Integer because foo3 could be pointing at a List<Double>.
		// You can't add a Double because foo3 could be pointing at a List<Integer>.
		// You can't add a Number because foo3 could be pointing at a List<Integer>.
		
		
		List<? super Integer> foo6 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
		List<? super Integer> foo7 = new ArrayList<Number>();   // Number is a superclass of Integer
		List<? super Integer> foo8 = new ArrayList<Object>();   // Object is a superclass of Integer
		
		// Reading
		// You aren't guaranteed an Integer because foo3 could be pointing at a List<Number> or List<Object>.
		// You aren't guaranteed a Number because foo3 could be pointing at a List<Object>.
		// The only guarantee is that you will get an instance of an Object or subclass of Object (but you don't know what subclass).
		
		
		// Writing
		// You can add an Integer because an Integer is allowed in any of above lists.
		// You can add an instance of a subclass of Integer because an instance of a subclass of Integer is allowed in any of the above lists.
		// You can't add a Double because foo3 could be pointing at an ArrayList<Integer>.
		// You can't add a Number because foo3 could be pointing at an ArrayList<Integer>.
		// You can't add an Object because foo3 could be pointing at an ArrayList<Integer>.
		
		
		
		
	}

}
