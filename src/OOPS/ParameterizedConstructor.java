package OOPS;

public class ParameterizedConstructor {
	
    int id;
    String name;
    
    ParameterizedConstructor(int i,String s){
    id =i;
    name = s;
    }
    void display() {
    	System.out.println(+id +" "+name);
    }
	public static void main(String[] args) {
		ParameterizedConstructor s1 = new ParameterizedConstructor(101,"Darshan");
		ParameterizedConstructor s2 = new ParameterizedConstructor(102,"Gowda");
		s1.display();
		s2.display();
		
	}
	
}
