package com.effectivejava.tutorial.effectivejava.itema29;

import java.util.Arrays;
import java.util.EmptyStackException;

//Generic stack using Object[] (Pages 130-3)
public class StackTechTwo<E> {
	
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackTechTwo() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	// Appropriate suppression of unchecked warning
	public E pop() {
		if (size == 0)
			throw new EmptyStackException();

		// push requires elements to be of type E, so cast is correct
		@SuppressWarnings("unchecked")
		E result = (E) elements[--size];

		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	// Little program to exercise our generic Stack
	public static void main(String[] args) {
		
		StackTechTwo<String> stack = new StackTechTwo<>();
		
		for (String arg : args)
			stack.push(arg);
		
		while (!stack.isEmpty())
			System.out.println(stack.pop().toUpperCase());
		
		
	}
	
}