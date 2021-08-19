package com.effectivejava.tutorial.effectivejava.itema69toHalfOfCapter10;

public class TestDriveSupport {
	
	public static void main(String[] args) {
		
		// Özelden Genele gitmezsen compile time'da hata alırsın.
		
		int[] numbers = new int[] {1, 34, 56, 23, 78, 123, 49};
        int[] dividers = new int[] {5, 0, 12, 0, 34};
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + dividers[i] + "=" + numbers[i]/dividers[i]);
            } 
            catch (ArithmeticException ex) {
                System.out.println("Division by 0, " + numbers[i] + "/" + dividers[i]);
            } 
            catch (RuntimeException ex) {
                System.out.println("Another exception catched : " + ex);
            }
        }
        System.out.println("Program ended successfully");
		
	}
	
	// TestDrive Support 2

}
