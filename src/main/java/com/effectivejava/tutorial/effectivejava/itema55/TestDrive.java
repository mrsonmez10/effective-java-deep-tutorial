package com.effectivejava.tutorial.effectivejava.itema55;

import static java.util.Optional.*;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
	
	public static void main(String[] args) {
		
		// ### Part1
		
		/*
		 * Notes: 
		 * Optional nedir?
		 * 	Amacı null pointer exceptionları en aza indirgemek.
		 * 	Null kontrolü yapılmasına gerek kalmaz.
		 * 	Yazılım ve okunabilirlik artar.
		 *  
		 */
		
		List<Insan> insan0 = new ArrayList<>(); // Boş Liste
		insan0 = null;
		
		Insan insan = new Insan();
		insan.setName("Furkan");
		insan.setYaş(24);
		List<Insan> insanDolu = new ArrayList<>(); // Dolu Liste
		insanDolu.add(insan);
		
		
		// 1
		java.util.Optional<Insan> insan1 = empty(); // Boş nesne
		// 2
		//java.util.Optional<List<Insan>> insan2 = of(insan0); // null değer alamaz
		// 3
		java.util.Optional<List<Insan>> insan3 = ofNullable(insanDolu); // null değer alır
		
		
		String isim = insan3.get().get(0).getName();
		System.out.println("Burası " + isim);
		
		
		/*
		 * Methods:
		 * isPresent() 	null kontorülüdür. Boş ise false, Dolu ise true değerini döndürür.
		 * orElse()	kullanici.get().get(0).getName().orElse("Ali"); şeklinde bir şart ile true ya da false değer döndürerek gerekli nesneyi seçebilirsiniz
		 * orElseGet()	Nesne içerisinde eğer bir değer null ise varsaydığımız değeri göndeerebiliyoruz.
		 * ifPresent()	Eğer null değilse istediğimiz işlemleri ise bu parametre ile yapmaktayız.
		 */
		
		insan3
		.filter(ad -> ad.get(0).getName().equalsIgnoreCase("Furkan"))
		.ifPresent(System.out::println); // null depilse kontrolü tek satır
		
		Integer nullYas = null;
		Integer yas = java.util.Optional.ofNullable(nullYas).orElse(24);
		System.out.println(yas);
		
		String nullName = null;
		String name = java.util.Optional.ofNullable(nullName).orElseGet(() -> "john");
		System.out.println(name);
		
	}
	
	
	public String getUsernameById(List<Insan> insan, int yaş)
	{    
		return insan.stream()
			.filter(person -> person.getYaş() == yaş)
			.findFirst()                            
			.map(Insan::getName)
			.orElseThrow(NullPointerException::new); // Burada kendi exceptionununuzu da attırabilirsiniz. InsanNotFoundException gibi
	}	
	
	
	
	/*
	 * Notes:
	 * if you unable to return value in some cases-> you can return null or throw an exception.
	 * 	1) Returning a exception is expensive expensive because the entire stack trace is captured
	 * 	2) We talked about null conditions prev. in previous lesson.
	 * 
	 */
	
}
