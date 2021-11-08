package com.effectivejava.tutorial.effectivejava.itema88b89;

import java.util.*;

//Enum singleton - the preferred approach - Page 311
public enum ElvisE {
	INSTANCE;

	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
	
}
