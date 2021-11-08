package com.effectivejava.tutorial.effectivejava.itema90;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestDrive {
	
	public static void main(String[] args) throws IOException {
		
		TruePerson tp = new TruePerson("Furkan", 24);

		String filePath = "D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\itema90\\TruePerson.txt";
		
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(tp);
		
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		TruePerson myExampleDeser = null;
		
		try {
			myExampleDeser = (TruePerson) objectInputStream.readObject();
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
