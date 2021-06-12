package com.effectivejava.tutorial.effectivejava.itema45;

//Refrain from using streams to process char values (Page 206)
public class CharStream {
	public static void main(String[] args) {
		
		// Does not produce the expected result
		"Hello world!".chars().forEach(System.out::print);
		System.out.println();

		// Fixes the problem
		"Hello world!".chars().forEach(x -> System.out.print((char) x));
		System.out.println();
		
		
		/*
		   Bir dizi elemanın homojen olarak dönüşüme tabi tutulması
		   Elemanların filtrelenmesi
           Tek bir işlemle bir dizi elemanın toplanması, minimum değer hesaplanması, ard arda eklenmesi vs.
	       Bir dizi elemanın gruplanarak bir koleksiyona yazılması
	       Bir dizi eleman içerisinde belli kriterlere göre arama yapılması
		 */
		
	}
	
}
