package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String rev = "";

		// 1. Using the String concatination int len = str.length();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The Reverse of the String is : " + rev);

		/*
		 * //2. Using Character Array char ch[] = str.toCharArray(); for(int
		 * i=str.length()-1;i>=0;i--) { System.out.println(ch[i]); }
		 */

	}
}
