package com.effectivejava.tutorial.effectivejava.itema90;

import java.io.Serializable;

public class SerializationProxy implements Serializable {
	
	private String name;
	private int age;
	
	public SerializationProxy(TruePerson tp) {
		this.name = tp.getName();
		this.age = tp.getAge();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Object readResolve(){
		return new TruePerson(name, age);
	}

}
