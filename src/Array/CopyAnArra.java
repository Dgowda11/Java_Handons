package Array;

public class CopyAnArra {
   public static void main(String[] args) {
	
	   int a[] = { 2,3,4,5,6,7};
	   int b[] = new int[a.length];
	   
	   
	   for(int i=0;i<a.length;i++) {
		   System.out.println(a[i] +" ");
	   }
	   for(int j=0; j<a.length;j++) {
		   b[j] = a[j];
		   System.out.print(a[j] +" ");
	   }
}
}
