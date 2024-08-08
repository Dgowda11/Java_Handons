package OOPS;

public class Constructor {
     
	
	int num1 ;
	int num2 ;
	int result; 
	
	
	// default constructor ot no args constructor
	public Constructor() {
		num1 =5;
		num2 = 5;
		System.out.println("This is a Constructor");
	}
	
	//Parametersized Constructor
	public Constructor(int n) {
		num1 = n;
		num2 = n;
		
	}
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(7);
		System.out.println(obj.num1);
		
				
	}
}
