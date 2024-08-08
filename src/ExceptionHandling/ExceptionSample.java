package ExceptionHandling;

public class ExceptionSample {
    
	public static void main(String[] args) {
		
		int Userinput =0;
		try {
			Userinput = Integer.parseInt("2");
			String Fruits[] = {"Bananna","Watermelons","Apples","Oranges"};
			System.out.println("User picked " + Fruits[Userinput-1]);
		}catch (NumberFormatException e) {
			System.out.println("Invalid Numbers you can only give numbers.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Give numbers between 1 to 4");
			//To handle all type of exception
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
	}	
}
