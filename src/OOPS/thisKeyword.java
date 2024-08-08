package OOPS;

public class thisKeyword {
	int id;
    String name;
    
    thisKeyword(int id,String name){
    this.id =id;
    this.name = name;
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
