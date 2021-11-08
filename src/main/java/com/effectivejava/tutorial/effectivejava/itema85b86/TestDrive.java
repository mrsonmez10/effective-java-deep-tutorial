package com.effectivejava.tutorial.effectivejava.itema85b86;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDrive {
	
	public static void main(String[] args) throws IOException {
		
		// java Serialization nedir
		/*
		 * Serialization is the process of converting an object into a stream of bytes. 
		 * That object can then be saved to a database or transferred over a network.
		 */
		
//		User user = new User();
//		user.setId(52);
//		user.setName("BucketHead");
		
		String filePath = "D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\itema85b86\\user.txt";
		
//		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//		objectOutputStream.writeObject(user);
		
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		User deserializedUser = null;
		
		try {
			deserializedUser = (User) objectInputStream.readObject();
			System.out.println(deserializedUser.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Try with resource..
		
		
		
		
		
		
	
		/*
		 * Ek notlar:
		 * Bir sınıf Ser. implement ederse alt sınıfları da eder.
		 * Try with resource bahset
		 * 
		 */
		
		
		
	}

}
