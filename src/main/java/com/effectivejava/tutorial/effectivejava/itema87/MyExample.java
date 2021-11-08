package com.effectivejava.tutorial.effectivejava.itema87;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyExample implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6580854982436917611L;
	
	private String name;
	private String password;
	
	// geçiçi
	private transient String geçiciTempData = ""; 
	
	/*
	 * 
	 * 
	 */
	transient static String  ali = "abc";
	transient final String veliKonya = "qwd";

	public static String getAli() {
		return ali;
	}

	public static void setAli(String ali) {
		MyExample.ali = ali;
	}

	public String getVeliKonya() {
		return veliKonya;
	}

	public String getGeçiciTempData() {
		return geçiciTempData;
	}

	public void setGeçiciTempData(String geçiciTempData) {
		this.geçiciTempData = geçiciTempData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {

		String userName = name;
		String encryptedPassword = password + " salt";

		oos.writeObject(userName);
		oos.writeObject(encryptedPassword);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		// Decrypt ederek aldığını düşün..
		name = (String) in.readObject();
		password = (String) in.readObject();
		password = password.replace(" salt", "");
	

	}

	@Override
	public String toString() {
		return "MyExample [name=" + name + ", password=" + password + ", geçiciTempData=" + geçiciTempData
				+ ", veliKonya=" + veliKonya + "]";
	}


	
	

}
