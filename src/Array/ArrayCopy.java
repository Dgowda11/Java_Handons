package Array;

public class ArrayCopy {
     
	
	public static void main(String[] args) {
		
		int src[] = {1,2,3,4};
		int dest[] = {5,6,7,8};
		
		System.arraycopy(src, 0, dest, 0, 3);
		for(int i=0;i<dest.length;i++) {
			System.out.print(dest[i]);
		}
	}
}
