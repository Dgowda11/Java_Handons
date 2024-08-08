package MasterClass;

public class MethodSample {
	
	
	public static void main(String[] args) {
		MethodSample obj = new MethodSample();
		obj.doSomething("male");

	}
	
	
	 void doSomething(String gender) {
		 
		 String newtext = gender.equalsIgnoreCase("Male") ? "Hello sir" : "Hello madam" ;
		 
		 System.out.println(newtext);
		 /*
			 * if(gender == "Male") { System.out.println("Hello Sir"); } else {
			 * System.out.println("Hello Madam"); }
			 */
		 
	}

}
