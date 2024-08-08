package String;

public class RemoveWhiteSpaces {
    
	
	public static void main(String[] args) {
		
		String str = "Hello welcome to Java";
		String s1 = str.replaceAll("\\s", "");
		System.out.println(s1);
	}
}
