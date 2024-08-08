package MethodOverriding;

public class M2 extends M1{
	
	
	void run() {
		System.out.println("The Vehicle is safely running");
	}
	public static void main(String[] args) {
		M2 obj = new M2();
		obj.run();
	}

}
