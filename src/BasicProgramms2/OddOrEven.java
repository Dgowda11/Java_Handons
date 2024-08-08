package demo;

import java.util.Scanner;

public class OddOrEven {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num = sc.nextInt();
		
		if(Num%2 == 0) {
			System.out.println("The Number is a Even number");
		}
		else {
			System.out.println("The number is a odd number");
		}
	}
}
