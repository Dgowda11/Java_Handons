package OOPS;

public class MultipleInheritance3 implements MultipleInheritance1,MultipleInheritance2{
   
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		MultipleInheritance3 obj = new MultipleInheritance3();
		obj.print();
		
	}
}
