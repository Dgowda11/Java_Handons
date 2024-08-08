package Array;

public class ArrayClassName {
     
	
	
	public static void main(String[] args) {
		  
		int arr[] = {1,2,3,4};
		
		//getting class name 
		Class c = arr.getClass();
		String name = c.getName();
		String name2 = c.getPackageName();
		System.out.println(name);
		System.out.println(name2);
	}
}
