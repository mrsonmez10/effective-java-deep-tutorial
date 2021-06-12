package com.effectivejava.tutorial.effectivejava.itema49;

import java.math.BigInteger;

public class TestDrive {
	
	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("-1");
		mod(null);
	}
	
	/**
	* Metodunu burada açıkla ne yapıyorsun..
	*
	* @param m (modulus), pozitif olmalı
	* @return this mod m
	* @throws ArithmeticException m sıfıra eşitse veya daha küçükse
	*/
	public static BigInteger mod(BigInteger m) { 
	    if (m.signum() <= 0) { // 0 -1 1
	           throw new ArithmeticException("Modulus <= 0: " + m);
	    }
	    
	    // TODO
		return m;
	}

}
