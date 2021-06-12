package com.effectivejava.tutorial.effectivejava.itema39.reflection;

public class Metallica {

	public final static int KİŞİ_SAYISI = 4;
	private String vocalName;
	private int vocalAge;

	public Metallica() {
		// TODO Auto-generated constructor stub
		this("James", 59);
	}

	private Metallica(String vocalName, int vocalAge) {
		// TODO Auto-generated method stub
		this.vocalName = vocalName;
		this.vocalAge = vocalAge;
	}

	public String getVocalName() {
		return vocalName;
	}

	public void setVocalName(String vocalName) {
		this.vocalName = vocalName;
	}

	public int getVocalAge() {
		return vocalAge;
	}

	public void setVocalAge(int vocalAge) {
		this.vocalAge = vocalAge;
	}

	private void yaşıArtır() {
		++vocalAge;
	}
	
	@Deprecated(since = "2021 dne sonra oldu", forRemoval = true)
	public static void kişiSayısınıYazdır() {
		System.out.println("No:" + KİŞİ_SAYISI);
	}
	
	@Override
	public String toString() {
		return "Metallica [vocalName=" + vocalName + ", vocalAge=" + vocalAge + "]";
	}

}
