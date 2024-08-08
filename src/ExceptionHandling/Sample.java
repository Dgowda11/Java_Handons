package ExceptionHandling;

public class Sample {
   
	int UserInput =0;
	try {
		UserInput = Integer.parseInt("2");
		String Fruits[] = { "Apple" , "Bananna","Watermelon"};
		System.out.println("USer picked " +Fruits[UserInput-1] );
	} catch (NumberFormatException e) {
		e.printStackTrace();
	   System.out.println("Invalid you can only give numbers");
	}catch{ArrayIndexOutOfBoundsException ae){
		System.out.println("Input within the range of array");
	}
}
