package com.effectivejava.tutorial.effectivejava.itema49;

import java.util.Objects;

public class NullCheck {
	
	String something;
	
	public NullCheck(String something) {
		// TODO Auto-generated constructor stub
		this.something = Objects.requireNonNull(something);
	}
	
	public static void main(String[] args) {
		
		NullCheck n = new NullCheck(null);
		
	}

}
