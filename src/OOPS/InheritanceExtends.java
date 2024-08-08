package OOPS;

public class InheritanceExtends extends InheritanceSample{
  int bonus = 2000;
  
  void display() {
	  System.out.println(+salary +" " +bonus);
  }
  
  public static void main(String[] args) {
	  InheritanceExtends obj = new InheritanceExtends();
	  obj.salary =4000;
	  obj.bonus= 5000;
	  obj.display();
	  
  }
	
}
