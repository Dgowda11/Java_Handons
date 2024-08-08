package Array;

public class SampleArray {

	public static void main(String[] args) {
        
		///initialize using new keyword
	//	String a[] = new String[3]; // declaration and instantation
	//	a[0] = "Hello";
	//	a[1] = "Welcome"; // initialization
	//	a[2] = "Java";
        
		//initialize using curly brasis 
		String a[] = {"Hello","Welcome","Java"};
		
		
		// traversing array

		for (String i : a) {
			System.out.println(i);

		}
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
	}
}
