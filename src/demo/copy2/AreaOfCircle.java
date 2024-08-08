package demo.copy2;

import java.util.Scanner;

public class AreaOfCircle {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the rad of circle :");
	   float rad = sc.nextFloat();
	   sc.close();
	   float Area;
	   
	   long pie = 22/7;
	   Area = 2*pie*rad;
	   System.out.println("Area of the circle is :" +Area);
   }
}
