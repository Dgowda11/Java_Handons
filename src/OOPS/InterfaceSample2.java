package OOPS;

public class InterfaceSample2 implements InterfaceSample1 {

	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		InterfaceSample2 obj = new InterfaceSample2();
		obj.print();
	}
}
