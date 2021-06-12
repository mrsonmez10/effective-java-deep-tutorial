package com.effectivejava.tutorial.effectivejava.itema36;

public class TextBad {
	
	public static final int STYLE_BOLD = 1 << 0; 
	public static final int STYLE_ITALIC = 1 << 2; 
	public static final int STYLE_UNDERLINE = 1 << 2; 
	public static final int STYLE_STRIKETHROUGH = 1 << 3; 
	
	public void applyStyles(int styles)
	{
		
	}
	
	public static void main(String[] args) {
		
		
		TextBad tb = new TextBad();
		tb.applyStyles(1000);
	}
	
}
