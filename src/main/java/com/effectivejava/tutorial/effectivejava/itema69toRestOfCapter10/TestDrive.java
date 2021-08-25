package com.effectivejava.tutorial.effectivejava.itema69toRestOfCapter10;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.sun.el.parser.ParseException;

public class TestDrive {

	public static void main(String[] args) throws IncorrectFileNameException {
		
		// Bilinmesi gereken exceptionlar
		
		/*
		 *  IllegalArgumentException
		 *  IllegalStateException 
		 * 	NullPointerException
		 *  ArrayIndexOutOfBoundsException
		 *  ConcurrentModificationException
		 *  UnsupportedOperationException
		 */
		
		
		// IllegalArgumentException
//		String isim = "qwdw";
//		switch (isim) {
//		case "Ali":
//			// Do smth
//			break;
//		case "Veli":
//			// ..
//			break;
//		default:
//			throw new IllegalArgumentException("No Provider");
//		}
		
		
		
		// IllegalStateException
			// Dosyayı açmadan okumaya çalışmak
		
		
		// NullPointerException
//		String ali = null;
//		if(ali.equals("asd"))
//		{
//			throw new NullPointerException("Hata");
//		}
//		if("asd".equalsIgnoreCase(ali))
//		{
//			
//		}
		
		// ArrayIndexOutOfBoundsException
//		int ar[] = {10, 11, 12}; // 0 1 2 ar[0]
//        for (int i=0; i<=ar.length; i++)
//        {
//        	System.out.println(i);
//        	System.out.println(ar[i]);
//        }
        	

		
		// ConcurrentModificationException
//		List<Integer> integers = new ArrayList();
//		integers.add(1);
//		integers.add(2);
//		integers.add(3);
//
//	    for (Integer integer : integers) {
//	        integers.remove(2);
//	    }
		
		// UnsupportedOperationException
//		String str[] = { "Apple", "Banana" };
//		List<String> l = Arrays.asList(str); // Fixed size
//		System.out.println(l);
//		l.add("Mango");
		

		// Exception niye ve nasıl yazarım?

		
		// Chained Exception
//		String birthDate = "";
//		
//		DateFormat formatter = new SimpleDateFormat();
//		try {
//			Date birthday = formatter.parse(birthDate);
//		} catch (Exception ex) {
//			throw new InvalidBirthdayException("Date of birth is invalid", ex);
//		}
		

		// Item 75
//		int pozisyon = -1;
//		int size = 4;
//		if (pozisyon < 0) 
//		{
//			  throw new IndexOutOfBoundsException(0, 4, pozisyon);
//		}
				
		
		// Item 76 için item 7 stack örneğine git
		String isim = "Furkan";
		try {
			System.out.println(isim.substring(0,100));	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("boom");
		}
		System.out.println(isim);
		
		
		// Item 76 Dont ignore exceptions
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			// bu excepiton hayati derecede kritik değil ctd flow
		}
		
		
	}
	
}
