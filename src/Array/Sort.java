package Array;

public class Sort {
   
	public static void main(String[] args) {
		
		int a[] = {10,20,44,55,99,2,3};
		int temp =0;
		for (int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp =a[i];
	              	a[i] =a[j];			
					a[j]= temp;
				}
			}
		}
		System.out.println("The array after sorting is : ");
		for(int j=0;j<a.length;j++) {
			System.out.print( +a[j] +" ");
		}
	}
}
