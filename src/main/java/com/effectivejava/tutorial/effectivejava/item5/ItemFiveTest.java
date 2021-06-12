package com.effectivejava.tutorial.effectivejava.item5;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ItemFiveTest {

	public static void main(String[] args) {
			
//		Supplier<String> supplier = ()-> "Furkan";
//		
//		System.out.println(supplier.get());
//		
//		Supplier<Sözlük> türkçe = ()-> new Sözlük("Türkçe");
//		System.out.println(türkçe.get().toString());
//		
//		YazıAnaliziDependencyInjection as = new YazıAnaliziDependencyInjection(türkçe);
//		System.out.println(as.isValid());
//		

		
		Supplier<Double> randomValue = () -> Math.random(); 
		
		double random = Math.random();
		System.out.println("Bir " + random);
		System.out.println("iki " + Math.random());
		System.out.println("üç " +randomValue.get());
		System.out.println("dört " +randomValue.get());
		
		randomValue.get();
		Math.random();
		
		Supplier<String> dahaKısa = () -> YazıAnaliziDependencyInjection.upuzunBayağıUzunBirMetodYazıyorumŞuAnda();
		
		dahaKısa.get();
		
		
		
		Supplier<LocalDate> s1 = LocalDate::now;
		LocalDate s2 = LocalDate.now();
		
		System.out.println(s1.get()); //2016-10-25
		System.out.println(s2); //2016-10-25
		
		
		
		
	}
	
}
