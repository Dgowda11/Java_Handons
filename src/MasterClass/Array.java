package MasterClass;

public class Array {   
	
	
	public static void main(String[] args) {
		
		int[] myArray = new int[3];
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		
	    
		
		// Printing Array
		/*System.out.println(myArray.length);
		for(int i=0; i<myArray.length; i++) {
		System.out.println(i);
		*/
		
		//using For each loop
		for(int elements : myArray) {
			System.out.println(elements);
		}
	

}
}
