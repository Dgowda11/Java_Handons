package OOPS;

public class InterfaceInheritance3 implements InterfaceInheritance2 {

	public void print() {
		System.out.println("hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		InterfaceInheritance3 obj = new InterfaceInheritance3();
		obj.print();
		obj.show();
	}
}
