package demo.copy2;

import java.util.Scanner;

public class DaysInAMonth {

	public static void main(String[] args) {

		/// Print no of days in a month
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number : ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("31 days Jan");
			break;
		case 2:
			System.out.println("28||29 days Feb");
			break;
		case 3:
			System.out.println("31 days Mar");
			break;
		case 4:
			System.out.println("30 days April");
			break;
		case 5:
			System.out.println("31 days May");
			break;
		case 6:
			System.out.println("30 days Jun");
			break;
		case 7:
			System.out.println("31 days July");
			break;
		case 8:
			System.out.println("31 days Aug");
			break;
		case 9:
			System.out.println("30 days Sep");
			break;
		case 10:
			System.out.println("31 days Oct");
			break;
		case 11:
			System.out.println("30 days Nov");
			break;
		case 12:
			System.out.println("31 days Dec");
			break;
		default:
			System.out.println("Enter a valid number");

		}
	}
}
