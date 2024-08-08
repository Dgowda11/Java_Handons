package OOPS;

public class MethodOverloading2 {
   //changine the dataype of the arguments
	static int add(int a, int b) {return a+b;}
	static double add(double a ,double b) {return a+b;}

	public static void main(String[] args) {
		System.out.println(MethodOverloading2.add(10, 20));
		System.out.println(MethodOverloading2.add(10, 20));
		
	}
}