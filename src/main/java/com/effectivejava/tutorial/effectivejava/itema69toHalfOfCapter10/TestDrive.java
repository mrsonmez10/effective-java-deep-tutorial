package com.effectivejava.tutorial.effectivejava.itema69toHalfOfCapter10;

public class TestDrive { 
	
	public static void main(String[] args) {
		
		// Part1: Exception nedir? -> İstisna
		/*
		 * uygulama çalışırken meydana gelen hatalardır.
		 * 
		 * Uygulama komple down olabilir. Hatalar Tolere de edilebilir.
		 * 
		 * Throwable tüm hataların atası: class is the superclass of all errors and exceptions in the Java language. 
		 * 	Exception ve Error -> Throwable Sınıflarının alt sınıfları.
		 * 	Error JVM hataları içeriyor. Biz exception ile ilerlicez.
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		// Part2: Basit Giriş
		try {
		    // Kodumuz
		} catch(Exception e) {
		    // Hataya müdahale
		} catch(StackOverflowError e2) {
		    // Hataya müdehale
		}
		
		
		// Part3: Doğru bir exception yakalama
		ArrayOperations operations = new ArrayOperations();
        int[] numbers = new int[7];
        try 
        {
            System.out.println("try block is started");
            operations.putValue(numbers, 10, 27);
            System.out.println("try block is ended");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception catched " + ex.toString());
        }
        System.out.println("Ends");
		
        
        // Eğer hatayı yönetmeseydik.
//        ArrayOperations operations2 = new ArrayOperations();
//        int[] numbers2 = new int[7];
//        System.out.println("Metot çağırımı");
//        operations.putValue(numbers2, 10, 27);
//        System.out.println("Burayı göremezsin");
        
        
        // Farklı bir exception tipi yazsaydık Part3 ilk örnekte dene.
        
        
        // Part4 -> TestDrive Support: Özelden Genele
        
        
        
        // Unchecked: Run timeda oluşacak hatar
        // Checked Compiler tarafından kontrol edilen hatalar.(IOException)
        
		
		
		// NOT: Exceptionı her zaman söylediğimiz gibi sadece gerektiğinde kullan!
	}

}
