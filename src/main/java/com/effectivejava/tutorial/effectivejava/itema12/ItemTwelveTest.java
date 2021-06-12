package com.effectivejava.tutorial.effectivejava.itema12;

import com.effectivejava.tutorial.effectivejava.itema15.GuvenliKod;

public class ItemTwelveTest extends GuvenliKod{
	
	public static void main(String[] args) {

		Request as = new Request();
		as.setBody("Govde");
		as.setHeader("Kafa");

		System.out.println(as.toString());
		
		
		
		

	}

	@Override
	public void mesaj() {
		// TODO Auto-generated method stub
		
	}


}
