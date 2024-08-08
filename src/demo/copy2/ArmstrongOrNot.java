package demo.copy2;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {

		/// Armstrong number is a number equals to sum of the cube of its all digits

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org_num = num;
		int sum = 0;

		while (num > 0) {
			sum = sum + (num % 10) * (num % 10) * (num % 10);
			num = num / 10;
		}
		if (sum == org_num) {
			System.out.println("Its an armstrong number");
		} else {
			System.out.println("Its not an armstong number");
		}
	}
}
