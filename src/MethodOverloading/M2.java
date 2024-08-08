package MethodOverloading;

public class M2 {
  // by changing he data types   
	
	int add (int a , int b) {
		return a+b;
	}
	 double add(double a, double b, double c) {
		return  a+b+c;
	}
	 public static void main(String[] args) {
		M2 obj = new M2();
		System.out.println(obj.add(10, 20));
	    System.out.println(	obj.add(10, 20, 30));
	}
}
