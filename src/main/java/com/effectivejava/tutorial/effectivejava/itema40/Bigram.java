package com.effectivejava.tutorial.effectivejava.itema40;

import java.util.*;

//Can you spot the bug? (Page 188)
public class Bigram {
	private final char first;

	public Bigram(char first) {
		this.first = first;
	}

	
	public boolean equals(Bigram b) {
		return b.first == first;
	}

	public int hashCode() {
		return 31 * first;
	}

	public static void main(String[] args) {
		Set<Bigram> s = new HashSet<>();
		
		// key setin 2 tane aynı şeyi içeremez
		s.add(new Bigram('a'));
		s.add(new Bigram('a'));
		s.add(new Bigram('c'));
		
		
		
		
		
//		for (int i = 0; i < 10; i++)
//			for (char ch = 'a'; ch <= 'z'; ch++)
//				s.add(new Bigram(ch, ch));
		System.out.println(s.size());
	}
}