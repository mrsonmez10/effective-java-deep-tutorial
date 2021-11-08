package com.effectivejava.tutorial.effectivejava.itema87;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BadBecomeGood implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private int size = 0 ;
     private Entry head = null ;

     // No more Serializable
     private static class Entry {
         String data ;
         Entry next ;
         Entry previous ;
     }

     private void writeObject(ObjectOutputStream s) throws IOException {
         s.defaultWriteObject();
         s.writeInt(size);

         // write all elements
         for (Entry e = head ; e!= null ; e= e.next) {
             s.writeObject(e.data);
         }
     }

     private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
         s.defaultReadObject();
         int  numElements = s.readInt() ;

         // Read All elements
         for (int i= 0 ; i< numElements; i++) {
             add((String) s.readObject()) ;
         }

     }

     // Appends the specific string ti the list
     private void add(String s) { }


}
