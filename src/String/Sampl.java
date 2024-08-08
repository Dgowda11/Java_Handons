package String;

import java.util.Scanner;

public class Sampl {
	public static void main(String[] args) {

	int num = 1261;
	int Org_num = num;
	int rev =0;

	    
	while(num>0) {
		  rev = rev*10 + num % 10;
		  num = num/10;
		
		}System.out.println("The revese of the no is : " + rev);
   
		if(Org_num == rev) {
			System.out.println("Its a palindrome");
		}else {
			System.out.println("Its not a plaindrome ");
		}
	}
}
