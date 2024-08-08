package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		hs.add("China");
		hs.add("America");
		System.out.println(hs.hashCode());
		System.out.println(hs.size());
		
		
		System.out.println("Hash set is : " +hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
} 
