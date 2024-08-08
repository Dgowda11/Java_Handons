package Constructor;

public class ConsOver {
    
	int id;
	String name;
	int age;
	
	ConsOver(int i,String n){
		id = i;
		name = n;
	}
	ConsOver(int i, String n,int a){
		id = i;
		name = n;
		age =a;
	}
	void display() {
		System.out.println(+id +" " +name +" " +age);
	}
	public static void main(String[] args) {
	
	ConsOver obj = new ConsOver(27, "Darshan");
	obj.display();
	ConsOver obj2  = new ConsOver(28, "Dhanush" , 22);
	obj2.display();
	}
}
