package OOPS;

public class Interface3 implements Interface1{
       
	
	public void draw() {
		System.out.println("Print Circle");
	}
	public static void main(String[] args) {
		Interface3 obj = new Interface3();
		obj.draw();
	}
	
}
