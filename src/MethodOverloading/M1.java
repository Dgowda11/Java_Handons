package MethodOverloading;

public class M1 {
      // By changing the number of arguments
	 int add  (int a , int b ) {
		return a+b;
	}
	 int add(int a, int b, int c) {
		 return a+b+c;
	 }
	 public static void main(String[] args) {
		 M1 obj = new M1();
		 System.out.println(obj.add(10, 0));
		System.out.println( obj.add(10, 20, 30));
	}
}
