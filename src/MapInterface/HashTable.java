package MapInterface;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
		
    	Hashtable<String,Integer> ht = new Hashtable<>();
    	ht.put("Dasrhan", 27);
    	ht.put("Gowda", 30);
    	
    	System.out.println("The player names are : ");
    	Enumeration e = ht.keys();
    	while (e.hasMoreElements()) {
    		System.out.println(e.nextElement());
    	}
    	
    	
	}
}
