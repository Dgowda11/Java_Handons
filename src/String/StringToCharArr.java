package String;

public class StringToCharArr {
    
	public static void main(String[] args) {
		
		String str = "Welcome";
		
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
	}
}
