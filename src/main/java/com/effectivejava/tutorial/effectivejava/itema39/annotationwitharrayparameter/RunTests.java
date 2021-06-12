package com.effectivejava.tutorial.effectivejava.itema39.annotationwitharrayparameter;

import java.lang.reflect.*;
import com.effectivejava.tutorial.effectivejava.itema39.markerannotation.Test;


// Program to process marker annotations and annotations with array parameter (Page 185)
public class RunTests {
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class<?> testClass = Class.forName("com.effectivejava.tutorial.effectivejava.itema39.annotationwitharrayparameter.Sample3");
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

			// Code to process annotations with array parameter (Page 185)
			if (m.isAnnotationPresent(ExceptionTest.class)) 
			{
				tests++;
				try 
				{
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (Throwable wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					int oldPassed = passed;
					Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest.class).value();
					for (Class<? extends Throwable> excType : excTypes)
					{
						if (excType.isInstance(exc))
						{
							passed++;
							break;
						}
					}
					if (passed == oldPassed)
						System.out.printf("Test %s failed: %s %n", m, exc);
				}
			}
		}
		System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
	}
}
