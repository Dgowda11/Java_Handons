package OOPS;

public class mtfOverriding2 extends MtdOverriding1{
    
	void vehicle() {
		System.out.println("The vehicle is safely running");
	}
	public static void main(String[] args) {
		mtfOverriding2 sc = new mtfOverriding2();
		sc.vehicle();
	}
}
