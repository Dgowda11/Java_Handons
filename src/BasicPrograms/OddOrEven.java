package BasicPrograms;

import java.util.Scanner;

public class OddOrEven {
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("The Number is a Even Number");
		}
		else {
			System.out.println("The Number is a odd number");
		}
		
	}
	
}
