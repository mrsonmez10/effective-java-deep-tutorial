package com.effectivejava.tutorial.effectivejava.itema51;

import java.util.Collections;

public class TestDrive {
	
	public int sum(int a, int b)
	{
		//TODO
		b = b*4;
		
		return a+b;
	}
	
	public int ekİşlem()
	{
		
		return 4;
	}
	
	
	
 
	public static void main(String[] args) {
		
		/*
		 * Method adlarını düzgün seçmelisin. +
		 * solid prensibine uy. (method çok iş yapmasın. Gerekiyorsa böl) 
		 * Method en fazla 4 parametre alacak şekilde dizayn edilmeli.
		 * 	Eğer fazla oluyorsa metodları kendi içinde bölebilirsin.
		 * 
		 * Boolean yerine 2 elemanlı enumlar kullanalabilirsin. termometre örneği.	
		 * 	Yarın bir gün Kelvin gelirse çok rahat entegre olur.
		 */
		
		// biri celc, fahr...
		
		
		
		boolean isCelcius = false;
		if(isCelcius)
		{
			System.out.println("Evet.");
		}
		else // Fahren...
		{
			
		}
		
		TemperatureScale value = TemperatureScale.FAHRENHEIT;
		if(TemperatureScale.CELCIUS == value)
		{
			// TODO...
		}
		else if(TemperatureScale.KELVIN == value)
		{
			
		}
		
		
		
	}

}
