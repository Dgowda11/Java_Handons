package demo;

import java.util.Scanner;

public class PostitveOrNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");

		int num1 = sc.nextInt();

		if (num1 > 0) {
			System.out.println("The number is a Positive number");
		} else {
			if (num1 < 0) {
				System.out.println("The number is a negative number");
			} else {
				System.out.println("The number is zero");
			}
		}
	}
}
