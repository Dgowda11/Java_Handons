package Array;

public class Largest {
   
	public static void main(String[] args) {
		
		int a[] = { 22,11,34,67,12,3,4};
		int max = a[0];
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max){
				max = a[i];
			
			}
		}
		System.out.println();
		System.out.println(max);
		
		
	}
}
