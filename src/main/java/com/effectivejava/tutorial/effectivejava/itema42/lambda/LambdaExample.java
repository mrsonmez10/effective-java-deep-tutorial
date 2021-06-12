package com.effectivejava.tutorial.effectivejava.itema42.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
	
	public String exampleFour() 
	{
		return "Örnek 4";
	}
	
	public String exampleFour2() 
	{
		return "Örnek 10";
	}
	
	public static void main(String[] args) {
		
		// lambda nedir
		/*
		 * Kendi başına tanımlanabilen, parametre kabul eden ve döndürebilen
		 * fonksiyondur.
		 * 
		 * Kullanım şekli: (argument-list) -> {body}
		 * 
		 */
		
		
		// ######1Functional Lambda
		
		
		Yazdır y = () -> {
			return "yazdım";
			};
		System.out.println(y.yazdır());
		
		
		
		// ######2 Functional with param
		
		String param = "Parametre";
		// Lambda with parameter
		YazdırParametre y2 = (paramAlacak) -> {
			return paramAlacak + " selam";
		};
		System.out.println(y2.yazdırParametreyi(param));
		
		
		
		
		// ######3 Method referansları 43. bölümde detaylı işleyeceğiz burada giriş yaptım.
		LambdaExample le = new LambdaExample();
		
		Yazdır write = le::exampleFour2;
		System.out.println(write.yazdır());

		
		// @functionalinterface içinde sadece tek metod olması gerektiğinde bahset. implementasyon sıkıntısı cıkmasın diye..
		

		
	}

}
