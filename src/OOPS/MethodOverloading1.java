package OOPS;

public class MethodOverloading1 {

	// 1. changineg no of arguments
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloading1.add(5, 10));
		System.out.println(MethodOverloading1.add(5, 10, 15));
	}
}
