package com.effectivejava.tutorial.effectivejava.itema87;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.effectivejava.tutorial.effectivejava.itema85b86.User;

public class TestDrive {
	
	public static void main(String[] args) throws IOException {
		
		MyExample myExample = new MyExample();
		myExample.setName("isim");
		myExample.setPassword("şifre");
		myExample.setGeçiciTempData("geçiçi değer");

		
		String filePath = "D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\itema87\\MyExample.txt";
		
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(myExample);
		
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		MyExample myExampleDeser = null;
		
		try {
			myExampleDeser = (MyExample) objectInputStream.readObject();
			System.out.println(myExampleDeser.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
