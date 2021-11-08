package com.effectivejava.tutorial.effectivejava.itema90;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class TruePerson extends WrongPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TruePerson(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
	}
	
	private Object writeReplace() {
        return new SerializationProxy(this);
    }
	
	private void readObject(ObjectInputStream stream) throws InvalidObjectException {
		throw new InvalidObjectException("Use Serialization Proxy instead.");
	}

	@Override
	public String toString() {
		return "TruePerson [writeReplace()=" + writeReplace() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
