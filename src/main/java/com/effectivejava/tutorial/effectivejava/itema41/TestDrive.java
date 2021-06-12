package com.effectivejava.tutorial.effectivejava.itema41;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.Remote;

public class TestDrive {
	
	// package com.effectivejava.tutorial.effectivejava.itema39.markerannotation;
	
	public static void main(String[] args)
		      throws IOException, ClassNotFoundException
		    {
		        A a = new A(34,"Istanbul");
		  
		        // Serializing 'a'
		        FileOutputStream fos = new FileOutputStream("xyz.txt");
		        ObjectOutputStream oos = new ObjectOutputStream(fos);
		        oos.writeObject(a);
		  
		        // De-serializing 'a'
		        FileInputStream fis = new FileInputStream("xyz.txt");
		        ObjectInputStream ois = new ObjectInputStream(fis);
		        A b = (A)ois.readObject();//down-casting object
		  
		        System.out.println(b.i+" "+b.s);
		  
		        // closing streams
		        oos.close();
		        ois.close();
		        
		        TestDrive test = new TestDrive();
		        
		        
		        
		    }

}
