package Array;

public class SumOFElemnts {
   public static void main(String[] args) {
	
	   
	   int a[] = new int[3];
	   a[0] =1;
	   a[1] =2;
	   a[2] = 3;
	   int sum =0; 
	     // using for loop 
		/*
		 * for(int i =0 ; i<=a.length-1;i++) { /// a.lenght = 5 sum = sum + a[i];
		 * 
		 * }
		 * 
		
		 */  	
	   for(int v : a) {
		   sum = sum + v;
		   
	   }
	   
	   System.out.println("The sum of elemnts in a Array : " +sum);
	   
}
}
