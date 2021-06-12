package com.effectivejava.tutorial.effectivejava.itema16;

public class Futbol {
	
	// 1-> Doğrudan erişilebilirliği kes
	// 2-> verilerimde kontrol sağlıyorum.
	// 3-> Read only
	// 4-> write only
	
	// 5-> Data hiding..
	

	private String takımAdı;
	private int takımOyuncuSayısı;

	public Futbol(String takımAdı, int takımOyuncuSayısı) {
		super();
		this.takımAdı = takımAdı;
		this.takımOyuncuSayısı = takımOyuncuSayısı;
	}


	public void setTakımAdı(String takımAdı) {
		this.takımAdı = takımAdı;
	}

	public int getTakımOyuncuSayısı() {
		return takımOyuncuSayısı;
	}

	public void setTakımOyuncuSayısı(int takımOyuncuSayısı) {
		if(takımOyuncuSayısı < 0)
		{
			System.out.println("olmaz");
		}
		this.takımOyuncuSayısı = takımOyuncuSayısı;
	}

}
