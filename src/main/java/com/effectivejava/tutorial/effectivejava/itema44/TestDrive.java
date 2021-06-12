package com.effectivejava.tutorial.effectivejava.itema44;

import java.util.function.BinaryOperator;

public class TestDrive {

	public static void main(String[] args) {

		BinaryOperator<Integer> op = 
				BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

		System.out.println(op.apply(98, 11));
		
		
		Integer.sum(3, 5);
			

	}
	
	

}
