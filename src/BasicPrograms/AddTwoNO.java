package BasicPrograms;

import java.util.Scanner;

public class AddTwoNO {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Enter Number 1: "); // int num1 = scan.nextInt();
		 * 
		 * System.out.println("Enter Number 2 : "); // int num2 = scan.nextInt();
		 * 
		 * scan.close(); // int Add = num1 + num2;
		 * 
		 * // System.out.println("The Addition of two number is : " + Add);
		 */
		
		
		// Program to add two non integers 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the number2 : ");
		double num2 = scan.nextDouble();
		double Add = num1 + num2;
		System.out.println("The Addition of two numbers : " +Add);

	}

}
