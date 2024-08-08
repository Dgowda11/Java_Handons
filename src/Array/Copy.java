package Array;

import java.util.Arrays;

public class Copy {
   public static void main(String[] args) {
	
	   
	   
	   int src [] = {1,2,3,4};
	   int dest[] = {5,6,7,8};
	   
	System.arraycopy(src, 0, dest, 0, 2);
    System.out.println(Arrays.toString(dest));
	
	
   }
}