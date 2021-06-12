package com.effectivejava.tutorial.effectivejava.itema39.markerannotation;

import java.lang.reflect.*;

public class RunTests {
	
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class<?> testClass = Class.forName("com.effectivejava.tutorial.effectivejava.itema39.markerannotation.Sample");
		for (Method m : testClass.getDeclaredMethods()) 
		{
			if (m.isAnnotationPresent(Test.class)) 
			{
				tests++;
				try 
				{
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("Invalid @Test: " + m);
				}
			}
		}
		System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
	}
	
}
