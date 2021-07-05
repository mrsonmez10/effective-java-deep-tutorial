package com.effectivejava.tutorial.effectivejava.itema55;

public class Insan {

	private String name;
	private int yaş;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYaş() {
		return yaş;
	}

	public void setYaş(int yaş) {
		this.yaş = yaş;
	}

	@Override
	public String toString() {
		return "Insan [name=" + name + ", yaş=" + yaş + "]";
	}

}
