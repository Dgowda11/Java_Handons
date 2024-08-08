package String;

public class SwapAString {
     
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		String s = s1+s2;  //HelloWorld
		
		System.out.println("The String before swap: " +s1 +" " +s2 );
	    s2 = s.substring(0, s.length()-s2.length());
	    s1 = s.substring(s2.length());
	    System.out.println("The String after swap: " +s1 +" " +s2);
	}
}
