package com.effectivejava.tutorial.effectivejava.itema34;

import java.math.RoundingMode;

public class TestDrive {
	
	// Tür güvenliği yok.
	// Debug zorlaşacak

	public static final int APPLE_FUJI         = 0;
	public static final int APPLE_PIPPIN       = 1;
	public static final int APPLE_GRANNY_SMITH = 2;
	 
	public static final int ORANGE_NAVEL  = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD  = 2;
	
	
	public enum Apple  { FUJI, PIPPIN, GRANNY_SMITH }
	public enum Orange { NAVEL, TEMPLE, BLOOD }
	
	// Singletonların genelleştirilmiş hali
	
	/*
	 * Tanımlı her enum sabitini public static final bir alan olarak dışa açan sınıflar olarak düşünülebilirler. 
	 * Enum türleri kalıtılamazlar ve dışarıdan erişilebilir yapıcı metotları olmadığından başka kod parçaları tarafından yaratılamazlar.
	 */
	
	public static void main(String[] args) {
		
		//RoundingMode
		
	}

}
