package com.effectivejava.tutorial.effectivejava.itema52;

import java.util.List;

//Classification using method overrriding (Page 239)
public class Overriding {
	
	public static void main(String[] args) {
		List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());

		for (Wine wine : wineList)
			System.out.println(wine.name());
	}
	
}
