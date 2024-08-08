package String;

import java.util.Scanner;

public class PalindromeString {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("The reverse of the string is : " +rev);
        
		if(rev.equals(str)) {
			System.out.println("The String is a Palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
	}
}
