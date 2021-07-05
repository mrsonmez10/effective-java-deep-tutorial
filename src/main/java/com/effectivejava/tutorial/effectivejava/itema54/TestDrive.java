package com.effectivejava.tutorial.effectivejava.itema54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive {

	private static final List<Cheese> cheesesInStock = new ArrayList<Cheese>();

	/**
	 * @return a list containing all of the cheeses in the shop,
	 *     or null if no cheeses are available for purchase.
	 */
	public static List<Cheese> getInStockCheeses() { // Look main method
		return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock);
	}
	
	// The right way to return a possibly empty collection
	public static List<Cheese> getCheeses() {
		return new ArrayList<>(cheesesInStock);
	
	}
	
	// Optimization - avoids allocating empty collections
	public static List<Cheese> getCheeses2()
	{
		return cheesesInStock.isEmpty() ? Collections.emptyList() 
				: new ArrayList<>(cheesesInStock);
	}

	// The right way to return a possibly empty array
	public Cheese[] getCheeses3()
	{
		return cheesesInStock.toArray(new Cheese[0]);
	}

	// Optimization - avoids allocating empty arrays
	private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

	public Cheese[] getCheeses4() {
		return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
		// Don’t do this - preallocating the array harms performance!
		//return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]);
	}
	
	public static void main(String[] args) {
		
		List<Cheese> cheeses = getInStockCheeses();

		if (cheeses != null && cheeses.contains(Cheese.CHEDDAR)) { // You need to check null
		  System.out.println("We have cheese in stock");
		}
		
	}
	
	/*
	 * In summary, never return null in place of an empty array or collection. 
	 * It makes your API more difficult to use and more prone to error,
	 * and it has no performance advantages.
	 */
	
}
