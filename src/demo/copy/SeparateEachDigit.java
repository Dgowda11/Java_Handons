package demo.copy;

public class SeparateEachDigit {
  public static void main(String[] args) {
	  
	  int num = 123;
	  
	  System.out.println(num%10);
	  num = num/10;
	  System.out.println(num%10);
	  num = num/10;
	  System.out.println(num%10);
  }
}
