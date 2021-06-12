package com.effectivejava.tutorial.effectivejava.itema23;

//Class hierarchy replacement for a tagged class  (Page 110-11)
class Circle extends FigureTrue {
	
	final double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * (radius * radius);
	}
	
}