package Array;

public class AverageOfElements {
   
   public static void main(String[] args) {
	   
	   double a[] = {19, 12.89, 16.5, 200, 13.7};
	   double total = 	0;
	   
	   	for(int i=0;i<a.length;i++) {
	   		total = total + a[i];
	   
	   	}
	   	double avg = total/a.length;
	   	System.out.format("The average of the elements is: %.3f", +avg);
   }
}
