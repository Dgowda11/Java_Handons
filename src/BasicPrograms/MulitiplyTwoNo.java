package BasicPrograms;

import java.util.Scanner;

public class MulitiplyTwoNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number2 : ");
		int num2 = sc.nextInt();
		
		
		int mul = num1*num2;
		
		System.out.println("Multiplication of the two value is : " +mul);
		
		
	}

}
