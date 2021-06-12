package com.effectivejava.tutorial.effectivejava.itema1011;


public class DenemeSınıfOvrd {
	
	private int a,b;
	
	public DenemeSınıfOvrd(int a, int b) {
		// TODO Auto-generated constructor stub
		
		this.a = a;
		this.b = b;
	}

	
//	@Override
//	public boolean equals(Object o) { 
//		  
//        // If the object is compared with itself then return true   
//        if (o == this) { 
//            return true; 
//        } 
//  
//        /* Check if o is an instance of DenemeSınıfOvrd or not 
//          "null instanceof [type]" also returns false */
//        if (!(o instanceof DenemeSınıfOvrd)) { 
//            return false; 
//        } 
//          
//        // typecast o to DenemeSınıfOvrd so that we can compare data members  
//        DenemeSınıfOvrd c = (DenemeSınıfOvrd) o; 
//          
//        // Compare the data members and return accordingly  
//        return Integer.compare(a, c.a) == 0
//                && Integer.compare(b, c.b) == 0; 
//    } 
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		int result = Integer.hashCode(b);
//		result = 31*result + Integer.hashCode(a);
//		return result;
//	}

	
//	@Override
//	public int hashCode() {
//	    return Objects.hash(a, b);
//	} 
	
}
