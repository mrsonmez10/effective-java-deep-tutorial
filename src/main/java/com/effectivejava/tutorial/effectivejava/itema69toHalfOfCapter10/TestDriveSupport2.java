package com.effectivejava.tutorial.effectivejava.itema69toHalfOfCapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class TestDriveSupport2 {
	
	
	static void stringConverter() throws NullPointerException {
	    String test = null;
	    test.toString();
	}
	
	
	public static void checkAge(Integer age){
		if(age == null)
		{
			throw new NullPointerException("qwşldmwq");
		}
	      if(age < 18)
	         throw new ArithmeticException("Not Eligible for voting");
	      else
	         System.out.println("Eligible for voting");
	   }
	
	/*
	 * 

	static void method() throws IOException
	{
		FileInputStream input = null;
	      
        try {
            ClassLoader classLoader = TestDriveSupport2.class.getClassLoader();
            input = new FileInputStream(classLoader.getResource("file.txt").getFile());
            int data = input.read();
          
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("Exception occurred while closing file");
                }
            }
        } 
	}	 */

	
	 public static void main(String[] args) {
		 
		 //stringConverter();
		 
//		 System.out.println("Hello");
//		 
//		 
//		 // Run time exception göster
//		 int a = 10, b = 0;
//	     System.out.println(a/b); 
		 
	    
	     checkAge(null);
		 
	 
		 
	     // Checked
//	     if (!isCorrectFileName(fileName)) {
//	 	    throw new IncorrectFileNameException("Incorrect filename : " + fileName );
//	 	}
	     
	     // Unchecked
//	     if (fileName == null || fileName.isEmpty())  {
//	    	    throw new NullOrEmptyException("The filename is null or empty.");
//	    	}
	     
	    }
}
