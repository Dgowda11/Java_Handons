package OOPS;

public class AbstractClass2 extends AbstractClass1{

    @Override
	void run() {
	System.out.println("Running safely");
	}
	public static void main(String[] args) {
		AbstractClass2 obj = new AbstractClass2();
			obj.run();
	}

}
