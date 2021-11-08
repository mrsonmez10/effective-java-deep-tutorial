package com.effectivejava.tutorial.effectivejava.itema88b89;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.util.SerializationUtils;

public class TestDrive {

	public static void main(String[] args) throws IOException {
		
		// Item 88 -> Item 50 Burada item 50'de defensive copy anlatımını öner ve read object
		// aslında public bir constructor olduğunu vurgula ve dersi kapat.
		
		// Item 89 -> Item 3
		/*
		 * readResolve Nedir? -> Serializable sınıflar deserialized olurken ayağa kalken metot.
		 * E amacı nedir? -> Akışta okunan nesneyi değiştirir.
		 * 
		 */
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		ObjectOutputStream oos;

		try {
		oos = new ObjectOutputStream(os);
		oos.writeObject(Elvis.INSTANCE);
		oos.close();

		ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Elvis e = (Elvis) ois.readObject();
		System.out.printf("Elvis is %s the one used before", e == Elvis.INSTANCE ? "-" : "not");
		ois.close();

		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
//		ByteArrayOutputStream bos = new ByteArrayOutputStream();
//		ObjectOutputStream out = null;
//		try {
//		  out = new ObjectOutputStream(bos);   
//		  out.writeObject(Elvis.INSTANCE);
//		  out.flush();
//		  byte[] yourBytes = bos.toByteArray();
//		  System.out.println();
//		} finally {
//		  try {
//		    bos.close();
//		  } catch (IOException ex) {
//		    // ignore close exception
//		  }
//		}
		
	}
	
}
