package com.effectivejava.tutorial.effectivejava.itema58;

public class TestDrive {
	
	/*
	 * the index of element is required, or
	 * the list has to be modified
	 */

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 2)
			{
				arr[i] = 2+3;
			}
			System.out.println(arr[i]);
		}
		
		System.out.println("#####");
		
		for (int eleman : arr) {
			System.out.println(eleman);
		}
		
		
		
	}

}
