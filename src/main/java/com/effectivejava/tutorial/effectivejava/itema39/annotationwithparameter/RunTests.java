package com.effectivejava.tutorial.effectivejava.itema39.annotationwithparameter;


import java.lang.reflect.*;
import com.effectivejava.tutorial.effectivejava.itema39.markerannotation.Test;

//Program to process marker annotations and annotations with a parameter (Page 184)
public class RunTests {
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class<?> testClass = Class.forName("com.effectivejava.tutorial.effectivejava.itema39.annotationwithparameter.Sample2");
		for (Method m : testClass.getDeclaredMethods()) 
		{
//			if (m.isAnnotationPresent(Test.class)) 
//			{
//				tests++;
//				try 
//				{
//					m.invoke(null);
//					passed++;
//				} catch (InvocationTargetException wrappedExc) {
//					Throwable exc = wrappedExc.getCause();
//					System.out.println(m + " failed: " + exc);
//				} catch (Exception exc) {
//					System.out.println("Invalid @Test: " + m);
//				}
//			}

			if (m.isAnnotationPresent(ExceptionTest.class)) 
			{
				tests++;
				try 
				{
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (InvocationTargetException wrappedEx) {
					Throwable exc = wrappedEx.getCause();
					Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
					if (excType.isInstance(exc)) 
					{
						passed++;
					} 
					else 
					{
						System.out.printf("Test %s failed: expected %s, got %s%n", m, excType.getName(), exc);
					}
				} catch (Exception exc) {
					System.out.println("Invalid @ExceptionTest: " + m);
				}
			}
		}

		System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
	}
}