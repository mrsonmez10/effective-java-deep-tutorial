package com.effectivejava.tutorial.effectivejava.itema34;

//Takes earth-weight and prints table of weights on all planets (Page 160)
public class WeightTable {
	
	public static void main(String[] args) {
		double earthWeight = 10;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
	
	
}