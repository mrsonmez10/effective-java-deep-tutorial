package com.effectivejava.tutorial.effectivejava.itema52;

import java.util.*;

//What does this program print? (Page 241)
public class SetList {
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		List<Integer> list = new ArrayList<>();

		for (int i = -3; i < 3; i++) {  //(-3 -2 -1 0 1 2) --  -2 0 2
			set.add(i);
			list.add(i);
		}
		for (int i = 0; i < 3; i++) {  // (-3 -2 -1) [-2, 0, 2]
			set.remove(i);
			list.remove(Integer.valueOf(i)); // cast et ya da Integer.valueof(i)
		}
		System.out.println(set + " " + list);
		
	}
}
