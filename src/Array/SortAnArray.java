package Array;

public class SortAnArray {
     
	public static void main(String[] args) {
		
		int a[]= {45,12,26,9,88};
		int temp = 0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i] =a[j];
					a[j] = a[i];
					a[j] =temp;
				}
			}
		}
		
		System.out.println("The array in the ascending order : ");
		for(int j=0 ; j<a.length;j++) {
			System.out.print(" " +a[j] );
		}
	}
}
