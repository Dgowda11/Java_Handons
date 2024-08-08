package demo.copy;

import java.util.Scanner;

public class FactorialOfGivenNO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		int facto = 1;

		for (int i = 5; i >= 1; i--) {
			facto = facto * i;

		}
		System.out.println(facto);
	}
}
