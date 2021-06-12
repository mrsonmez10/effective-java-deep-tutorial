package com.effectivejava.tutorial.effectivejava.itema14;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import static java.util.Comparator.*;

public final class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
	private final short areaCode, prefix, lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 9999, "line num");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max)
			throw new IllegalArgumentException(arg + ": " + val);
		return (short) val;
	}

	

//	@Override
//	public int hashCode() {
//		int result = Short.hashCode(areaCode);
//		result = 31 * result + Short.hashCode(prefix);
//		result = 31 * result + Short.hashCode(lineNum);
//		return result;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaCode;
		result = prime * result + lineNum;
		result = prime * result + prefix;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode != other.areaCode)
			return false;
		if (lineNum != other.lineNum)
			return false;
		if (prefix != other.prefix)
			return false;
		return true;
	}

	/**
	 * Returns the string representation of this phone number. The string consists
	 * of twelve characters whose format is "XXX-YYY-ZZZZ", where XXX is the area
	 * code, YYY is the prefix, and ZZZZ is the line number. Each of the capital
	 * letters represents a single decimal digit.
	 *
	 * If any of the three parts of this phone number is too small to fill up its
	 * field, the field is padded with leading zeros. For example, if the value of
	 * the line number is 123, the last four characters of the string representation
	 * will be "0123".
	 */
	@Override
	public String toString() {
		return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
	}

//    // Multiple-field Comparable with primitive fields (page 69)
//    public int compareTo(PhoneNumber pn) {
//        int result = Short.compare(areaCode, pn.areaCode);
//        if (result == 0)  {
//            result = Short.compare(prefix, pn.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, pn.lineNum);
//        }
//        return result;
//    }

	private static final Comparator<PhoneNumber> COMPARATOR = 
			comparingInt((PhoneNumber pn) -> pn.areaCode)
			.thenComparingInt(pn -> pn.prefix)
			.thenComparingInt(pn -> pn.lineNum);

	public int compareTo(PhoneNumber pn) {
		return COMPARATOR.compare(this, pn);
	}

	private static PhoneNumber randomPhoneNumber() {
		Random rnd = ThreadLocalRandom.current();
		return new PhoneNumber((short) rnd.nextInt(1000), (short) rnd.nextInt(1000), (short) rnd.nextInt(10000));
	}

	public static void main(String[] args) {
		NavigableSet<PhoneNumber> s = new TreeSet<PhoneNumber>();
		for (int i = 0; i < 10; i++)
			s.add(randomPhoneNumber());
		System.out.println(s);
	}
}