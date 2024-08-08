package BasicPrograms;

import java.util.Scanner;

public class CheckLeapYear {  
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int Year = sc.nextInt();
		
		if(Year%4 ==0) {
			System.out.println(Year +"The year is a Leap Year");
		}
		else {
	         System.out.println(Year+"The Year is not a Leap Year");
		}
	}

}
