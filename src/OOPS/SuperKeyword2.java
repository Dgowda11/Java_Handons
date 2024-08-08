package OOPS;

public class SuperKeyword2 extends SuperKeyword1{  
	
	String colour = "White";
	
	
	void printColour() {
		System.out.println(colour);
		//super keyword th refer immediate refer the instance the instance variable of parent class
		System.out.println(super.colour);
	}
	public static void main(String[] args) {
		SuperKeyword2 obj = new SuperKeyword2();
		obj.printColour();
	}

}
