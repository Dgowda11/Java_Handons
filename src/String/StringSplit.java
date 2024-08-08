package String;

public class StringSplit {

	public static void main(String[] args) {
	  
		String str = "Welcome to the Split world";
       //Split based on white spaces
		/*
		 * String[] s1 = str.split("\\s"); System.out.println(s1);
		 * 
		 * for(String s2:s1) { System.out.println(s2); }
		 */
		
		// split with regex and length 
	   for(String s3:str.split("\\s", 0)) {
		   System.out.println(s3);
		   
	   }
		
	}
}