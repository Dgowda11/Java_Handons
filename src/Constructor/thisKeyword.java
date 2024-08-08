package Constructor;

public class thisKeyword {
   
	int i;
	String name;
	int age;
	
	thisKeyword(int i, String name , int age){
		 this.i=i;
		 this.name = name ;
		 this.age = age;
	}
	void display() {
		System.out.println(+age +" " +name +" " +age);
	}
	public static void main(String[] args) {
		thisKeyword obj = new thisKeyword(27,"Dasrhan",22);
		obj.display();
	}
}
