package demo;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of the String :" + rev);

		if (rev == org_num) {
			System.out.println("Its a Palindrome");
		} else {
			System.out.println("Its not a palindrome");
		}
	}
}
