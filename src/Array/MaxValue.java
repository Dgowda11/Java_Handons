package Array;

public class MaxValue {
   public static void main(String[] args) {
	
	   int a[] = {1,2,3,4,5};
	   int Max =0;
	   
	   for(int i=0;i<a.length;i++) {
		   
		   if(a[i]>Max) {
			   Max = a[i];
		   }
	   }System.out.println(Max);
		   
}
}
