package OOPS;

public class MainOutsideClass {

	  static int id;
	  static String name;
} 
	  class main{
		  public static void main(String[] args) {
			  MainOutsideClass obj =new MainOutsideClass();
			  obj.id = 101;
			  obj.name = "Darsg";
			  System.out.println(obj.id +obj.name);
		   
	   }
   }