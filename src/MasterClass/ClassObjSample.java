package MasterClass;

public class ClassObjSample {
   
	public static void main(String[] args) {
		
		Person alex = new Person();
		alex.name="Alex";
		alex.gender= "Male";
		alex.sleep();
		
		Person mia = new Person();
		mia.name = "Mia";
		mia.age = 40;
		mia.gender = "Female";
		mia.sleep();
		
		Person james = new Person();
		james.name = "James";
		james.age = 5;
		james.gender = "Male";
		james.sleep();
		
	}
}
  
class Person{
	  String name;
	  int age;
	  String gender;
	  
	  
	 void sleep() {
		 if(age < 10) {
			 System.out.println(name +"\tWill sleep more than 12 hours ");
		 }else if(age>= 10 && age<=50) {
			 System.out.println(name +"\tWill less more than 10 hours");
		 }else {
			 System.out.println(name +"\twill sleep on average 10 hours");
		 }
	 }
}