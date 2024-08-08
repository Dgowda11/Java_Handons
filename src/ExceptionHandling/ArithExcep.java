package ExceptionHandling;

public class ArithExcep {
	public static void main(String[] args) {
		try {
			int num1 = 10, num2 = 0;
			int output = num1 / num2;
			System.out.println("Resule :" + output);
		} catch (ArithmeticException e) {
			System.out.println("Enter the valid number for division");
		}
	}
}