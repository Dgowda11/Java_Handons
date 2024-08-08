package OOPS;

public class COnstructorOverloading {
	int id;
	String name;
	int age;
    
	
	//Constructor overloading
	COnstructorOverloading(int i,String s){
		id = i;
		name =s;
	}
	COnstructorOverloading(int i,String s,int a){
		id =i;
		name = s;
		age =a;
		
	}
	void display() {
		System.out.println(+id +" " +name +" " +age);
	}
	public static void main(String[] agrs) {
		COnstructorOverloading s1 = new COnstructorOverloading(101,"Gowda",22);
		COnstructorOverloading s2 = new COnstructorOverloading(102,"Dgowda");
		s1.display();
		s2.display();
	}
}
