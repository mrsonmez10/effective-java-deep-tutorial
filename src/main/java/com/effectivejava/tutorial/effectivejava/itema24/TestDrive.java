package com.effectivejava.tutorial.effectivejava.itema24;

import java.util.AbstractSet;

public class TestDrive {
	
	public static void main(String[] args) {
		
		
		/*
		 * statik olan iç içe geçmiş sınıflar (static nested classes)
		   statik olmayan iç içe geçmiş sınıflar (non-static nested classes)
		   yerel sınıflar (local classes)
		   anonim sınıflar (anonymous classes)
		 * 
		 */
		
		
//		// Static Nested
//		StaticNested.staticNestedClass nesne = new StaticNested.staticNestedClass();
//			// HesapMakinesi.Operasyon.TOPLA
//			// Builder Ders2
//		
//		
//		// Non Static Nested
//			// Open for a memory leak..
//		
//		NonStaticNested nonStatic = new NonStaticNested();
//		NonStaticNested.NonStaticNestedClass nesne2 = nonStatic.new NonStaticNestedClass();
//		nesne2.yazBunu();
		
		// Local classes
		LocalClass lc = new LocalClass();
		
		
		// Anonim
		SuperClass sc = new SuperClass() {
			@Override
			public void yazBeni() {
				System.out.println("anonim");
			}
		};
		
		sc.yazBeni();
		
		
		
		SuperClassDerin scd = new SuperClassDerin() {
			@Override
			public void yazBeni() {
				// TODO Auto-generated method stub
				
			}
		};
		scd.yazBeni();
		
		
	}

}
