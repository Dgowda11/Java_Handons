package Array;

public class MinValue {
   public static void main(String[] args) {
	
	   int a[] = { 10,12,44,6,7};
	   int Min =a[0];
	   for(int i =1;i<a.length;i++ ) {
		   if(a[i]<Min) {
			   Min = a[i];
		   }
	   }System.out.println("The minimum value is : " +Min);
}
}
