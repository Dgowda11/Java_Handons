package Array;

public class MissingNumber {
  public static void main(String[] args) {
	  
int a[] = {1,2,4};
	// 1+2+4
	// 1+2+3+4 =
	// 3 is missing can be find by SUm 2 - sum1
	int sum =0;
	int sum2 =0;
	for(int i=0;i<a.length;i++) {
		sum = sum + a[i];
	}System.out.println("The sum of array : " +sum);
	
	for(int i=1;i<=4;i++) {
	    sum2 = sum2 +i;	
	}System.out.println("The sum of second array is : " +sum2);
	
	System.out.println("The Missing number is : " +(sum2-sum));
}
}