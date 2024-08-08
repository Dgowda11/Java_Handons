package String;

public class CharToString {
     
	public static void main(String[] args) {
		
		//There are two methods
		//1. Using   ToString() method 
		char ch = 'S';
		String s1 = Character.toString(ch);
		System.out.println(s1);
		
		//2. Using ValueOf() method
		String s2 = String.valueOf(ch);
		System.out.println(s2);
		
	}
	
}
