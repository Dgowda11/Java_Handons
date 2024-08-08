package Array;

public class ReverseanArray {
   
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int len = a.length;
		System.out.println(len);
		
		System.out.print("The Revrse of the array : ");
		for(int i=len-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}
	
	}
}
