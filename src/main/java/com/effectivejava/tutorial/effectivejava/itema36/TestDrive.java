package com.effectivejava.tutorial.effectivejava.itema36;

public class TestDrive {
	
	public static void main(String[] args) {
		 
		// 0000
		// 0001 -> 1
		// 0010 -> 2
		// 0011 -> 3
		
 
		int x = -4;
		System.out.println(x>>1);
		
		int y = 4;
		// 0100 -> 0010
		System.out.print("Şu an bu örnekteyiz ");
		System.out.println(y>>1);
		
		int xNeg = -1; 
		// 11111....1 -> 0000000.....000001
		System.out.println(x>>>30); // 000000...0011
		
		
		int diffY = 2;
		// 0010
		System.out.println(diffY<<1);
		
		
		// 0001 -> 0100
		System.out.println(1<<2);
		
		
	}

}
