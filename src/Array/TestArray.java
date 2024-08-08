package Array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arrayOne[] = new int[10];     //Initialize
     arrayOne[0] = 10;
     arrayOne[1] = 20;
     arrayOne[2] = 30;
     arrayOne[3] = 40;                 // Declaring 
     arrayOne[4] = 50;
     arrayOne[5] = 60;
     System.out.println(arrayOne[4]);   //accessing 
     
     for (int i=0;i<arrayOne.length;i++) {   //Iterating 
    	 System.out.println(arrayOne[i]);
     }
     //Declaring in single statement 
     int arrayTwo[]= {10,20,30,40,50,60};
     System.out.println("size of second array"+ arrayTwo.length);
     
	}

}
