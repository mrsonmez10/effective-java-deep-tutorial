package com.effectivejava.tutorial.effectivejava.itema47;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

// Adapters from stream to iterable and vice-versa (Page 216)
public class Adapters {
	
	// Adapter from Stream<E> to Iterable<E> (
	public static <E> Iterable<E> iterableOf(Stream<E> stream) {
		return stream::iterator;
	}

	// Adapter from Iterable<E> to Stream<E>
	public static <E> Stream<E> streamOf(Iterable<E> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false);
	}
	

	// Temel
	public static Stream<String> userNames() {
	    ArrayList<String> userNameSource = new ArrayList<>();
	    userNameSource.add("john");
	    userNameSource.add("smith");
	    userNameSource.add("tom");
	    return userNameSource.stream();
	}
	
	// Dönüşüm
	public List<String> userNameList() {
	    return userNames().collect(Collectors.toList());
	}
	
	public static Set<String> userNameSet() {
	    return userNames().collect(Collectors.toSet());
	}
	// Dönüşüm
	
	// işlemler
	public static Stream<String> filterUserNames() {
	    return userNames().filter(i -> i.length() >= 4);
	}

	public static Stream<String> sortUserNames() {
	    return userNames().sorted();
	}

	public static Stream<String> limitUserNames() {
	    return userNames().limit(3);
	}
	// işlemler
	
}
