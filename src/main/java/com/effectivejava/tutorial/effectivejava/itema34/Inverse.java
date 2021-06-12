package com.effectivejava.tutorial.effectivejava.itema34;

//Switch on an enum to simulate a missing method (Page 167)
public class Inverse {
	public static Operation inverse(Operation op) {
		
		switch (op) {
		case PLUS:
			return Operation.MINUS;
		case MINUS:
			return Operation.PLUS;
		case TIMES:
			return Operation.DIVIDE;
		case DIVIDE:
			return Operation.TIMES;

		default:
			throw new AssertionError("Unknown op: " + op);
		}
	}

	public static void main(String[] args) {
		double x = 5;
		double y = 4;
		for (Operation op : Operation.values()) {
			Operation invOp = inverse(op);
			System.out.printf("%f %s %f %s %f = %f%n", x, op, y, invOp, y, invOp.apply(op.apply(x, y), y));
		}
	}
	
	//  Derleme anında değerlerini bildiğiniz bir grup değişmeze ne zaman ihtiyaç duyarsanız enum kullanın
	/*
	 * Her enum sabiti için farklı davranışlar belirlemeniz gereken durumlarda switch deyimi ile farklı davranışları kodlamak yerine 
	 * enum içinde soyut bir metot tanımlayıp her enum sabiti için bu metodu geçersiz kılın. 
	 * Eğer bazı enum sabitlerinin davranışları birbiriyle aynı ise strateji enum desenini uygulayın.
	 */
}