package com.effectivejava.tutorial.effectivejava.itema1011;

import java.awt.Color;

public class ColorPointInherit extends Point {
	private final Color color;

	public ColorPointInherit(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	// Broken - violates symmetry! (Page 41)
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPointInherit))
			return false;
		return super.equals(o) && ((ColorPointInherit) o).color == color;
	}

//    // Broken - violates transitivity! (page 42)
//    @Override public boolean equals(Object o) {
//        if (!(o instanceof Point))
//            return false;
//
//        // If o is a normal Point, do a color-blind comparison
//        if (!(o instanceof ColorPoint))
//            return o.equals(this);
//
//        // o is a ColorPoint; do a full comparison
//        return super.equals(o) && ((ColorPoint) o).color == color;
//    }

	public static void main(String[] args) {
		// First equals function violates symmetry (Page 42)
		Point p = new Point(1, 2);
		ColorPointInherit cp = new ColorPointInherit(1, 2, Color.RED);
		System.out.println(p.equals(cp) + " " + cp.equals(p));

		// Second equals function violates transitivity (Page 42)
		ColorPointInherit p1 = new ColorPointInherit(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPointInherit p3 = new ColorPointInherit(1, 2, Color.BLUE);
		System.out.printf("%s %s %s%n", p1.equals(p2), p2.equals(p3), p1.equals(p3));
	}
}