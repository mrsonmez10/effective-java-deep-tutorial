package com.effectivejava.tutorial.effectivejava.itema48;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TestDrive {
	
	public static void main(String[] args) {

		
		//IntStream.range(0,15).parallel().forEach(System.out::println);

		
		long startTime = System.nanoTime();
		//test();       // 2013221300
		testParallel(); // 1036918600
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		
	}
	
    public static void test() 
    {
    	List<String> stringList = new ArrayList<String>();
    	stringList.add("1203823");
    	stringList.add("1236724");
    	
        for (String customer : stringList) 
        {
            try 
            {
                Thread.sleep(1000);    
                // Buss
                // Servis isteği
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }

            System.out.println("Thread name : " + Thread.currentThread().getName());

        }

    }
    
    public static void testParallel() 
    {	
    	List<String> stringList = new ArrayList<String>();
    	stringList.add("1203823");
    	stringList.add("1236724");
    	
    	stringList.parallelStream().forEach(customer -> 
    	{
            try 
            {
                Thread.sleep(1000);
                // akış servis çağırımı
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("Thread name : " + Thread.currentThread().getName());
        });
    }

}
