package MasterClass;

public class ArrayString {
     
	public static void main(String[] args) {
		Person[] users = new Person[3];
		
		Person alex = new Person();
		alex.name="Alex";
		alex.gender= "Male";
	
		
		Person mia = new Person();
		mia.name = "Mia";
		mia.age = 40;
		mia.gender = "Female";
		
		
		Person james = new Person();
		james.name = "James";
		james.age = 5;
		james.gender = "Male";
		
		
		users[0] = alex;
		users[1] = mia;
		users[2] = james;
		
		System.out.println(users[0].age);
		
	}
}
