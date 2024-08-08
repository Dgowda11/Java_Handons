package OOPS;

public class Initializethroughmethod {
   
	int id;
	String name;
	
	void doSomething(int r , String s) {
		id = r;
		name = s;
	}
	void display(){
		System.out.println(id +" " +name);
	}
	public static void main(String[] args) {
		Initializethroughmethod s1 = new Initializethroughmethod();
		Initializethroughmethod s2 = new Initializethroughmethod();
		
		s1.doSomething(5, "Dasrahan");
		s2.doSomething(10, "Dgowda");
		s1.display();
		s2.display();
	}
}
