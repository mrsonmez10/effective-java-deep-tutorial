package com.effectivejava.tutorial.effectivejava.itema13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable{
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public String stackName;
	
	public String getStackName() {
		return stackName;
	}


	public void setStackName(String stackName) {
		this.stackName = stackName;
	}


	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}


	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// Ensure space for at least one more element.
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
	
	// Clone method for class with references to mutable state
	@Override
	public Stack clone() {
		try {
			Stack result = (Stack) super.clone();
			result.elements = elements.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
//	public Object clone()throws CloneNotSupportedException{  
//	return super.clone();  
//	}  
	

	// To see that clone works, call with several command line arguments
	public static void main(String[] args)  {
		
		Stack stack = new Stack();
		
		String[] numaralar = {"1", "2", "3", "4"};
		for (String arg : numaralar)
			stack.push(arg);
		
		Stack copy = stack.clone();
		
	
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		
		System.out.println();
	
		while (!copy.isEmpty())
			System.out.print(copy.pop() + " ");
	}
}