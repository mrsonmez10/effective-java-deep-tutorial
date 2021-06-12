package com.effectivejava.tutorial.effectivejava.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	
	public Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public void finalize()
	{
		System.out.println("Çöpler Toplandı");
	}
	
	public Stack() {
		// TODO Auto-generated constructor stub
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(Object e)
	{
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop()
	{
		if(size == 0)
			throw new EmptyStackException();
		return elements[--size];
	}
	
	public Object popWell()
	{
		if(size == 0)
			throw new EmptyStackException();
		
		Object result = elements[--size];
		elements[size] = null;
		
		return result;
		
	}
		
	/**
	     * Ensure space for at least one more element, roughly
	     * doubling the capacity each time the array needs to grow.
     */
	private void ensureCapacity()
	{
		if(elements.length == size)
		{
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
	
}
