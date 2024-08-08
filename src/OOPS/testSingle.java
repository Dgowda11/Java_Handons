package OOPS;

class testSingle extends SingleInheritance{
	
	void Dancer() {
	System.out.println("He can dance");
}   
	public static void main(String[] args) {
		testSingle sc = new testSingle();
		sc.Dancer();
		sc.Human();
	}
}
