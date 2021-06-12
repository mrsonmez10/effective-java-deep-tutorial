package com.effectivejava.tutorial.effectivejava.itema14;

public class Kitap implements Comparable<Kitap>{

	private String isim;
	private int sayfa;
	
	public Kitap(String isim, int sayfa) {
		// TODO Auto-generated constructor stub
		this.isim = isim;
		this.sayfa = sayfa;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getSayfa() {
		return sayfa;
	}

	public void setSayfa(int sayfa) {
		this.sayfa = sayfa;
	}
	
	@Override
	public int compareTo(Kitap o) {
		// TODO Auto-generated method stub
		return this.sayfa - o.sayfa;
	}

	@Override
	public String toString() {
		return "Kitap [isim=" + isim + ", sayfa=" + sayfa + "]";
	}
	
}
