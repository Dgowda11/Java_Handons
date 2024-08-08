package demo.copy;

import java.util.Scanner;

public class Swap2NoWithout3rdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		// a =10 and b=20
		System.out.println("The variables before swaping : " + a + " " + b);
		a = a + b; /// 10+20 =30
		b = a-b; // 20-10 = 10
		a = a - b;
		System.out.println("The variables after swaping : " + a + " " + b);

	}
}
