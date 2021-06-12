package com.effectivejava.tutorial.effectivejava.item2;

public class StarbucksBuilder {
	
	// Gerekli
	private String kahveBoyutu;
	
	// Seçime göre değişir
	private String laktozsuzSütMiktarı;
	private String yumuşatıcı;
	
	
	
	public static class Builder{
		
		// Gerekli
		private final String kahveBoyutu;
		
		// Seçime göre değişir
		private String laktozsuzSütMiktarı;
		private String yumuşatıcı;
		
		
		public Builder(String kahveBoyutu) {
			super();
			this.kahveBoyutu = kahveBoyutu;
		}

		public Builder laktozsuzTayfa(String laktozsuzSut)
		{
			laktozsuzSütMiktarı = laktozsuzSut;
			return this;
		}
		
		public Builder yumuşakİçenler(String yumuşakDeğer)
		{
			yumuşatıcı = yumuşakDeğer;
			return this;
		}
		
		
		public StarbucksBuilder build()
		{
			return new StarbucksBuilder(this);
		}
		
	}
	
	public StarbucksBuilder(Builder builder) {
		// TODO Auto-generated constructor stub
		kahveBoyutu = builder.kahveBoyutu;
		laktozsuzSütMiktarı = builder.laktozsuzSütMiktarı;
		yumuşatıcı = builder.yumuşatıcı;
		
	}


}
