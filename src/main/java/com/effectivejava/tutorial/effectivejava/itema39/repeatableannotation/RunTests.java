package com.effectivejava.tutorial.effectivejava.itema39.repeatableannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.effectivejava.tutorial.effectivejava.itema39.markerannotation.Test;

// Program to process marker annotations and repeatable annotations (Page 187)
public class RunTests {
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class testClass = Class.forName("com.effectivejava.tutorial.effectivejava.itema39.repeatableannotation.Sample4");
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
					System.out.println("INVALID @Test: " + m);
				}
			}

			// Processing repeatable annotations (Page 187)
			if (m.isAnnotationPresent(ExceptionTest.class) || m.isAnnotationPresent(ExceptionTestContainer.class)) 
			{
				tests++;
				try 
				{
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (Throwable wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					int oldPassed = passed;
					ExceptionTest[] excTests = m.getAnnotationsByType(ExceptionTest.class);
					for (ExceptionTest excTest : excTests) 
					{
						if (excTest.value().isInstance(exc)) 
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
