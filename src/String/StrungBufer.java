package String;

public class StrungBufer {
	
	// Java StringBuffer class is used to create mutable (modifiable) String
	// objects. The StringBuffer class in Java is the same as String class except it
	// is mutable i.e. it can be changed.

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		// Adppen() >> to concate new string 
		/*
		 * sb.append(" World"); System.out.println(sb);
		 */
		
		
		// insert() to insert new string
		sb.insert(5, " World");
		System.out.println(sb);
		
		
	}

}
