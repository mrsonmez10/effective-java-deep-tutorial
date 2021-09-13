package com.effectivejava.tutorial.effectivejava.itema79.bookexample;

//Set obeserver callback interface - Page 266
public interface SetObserver<E> {
	
	// Invoked when an element is added to the observable set
	void added(ObservableSet<E> set, E element);
	
}