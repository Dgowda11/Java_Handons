package demo.copy;

public class MxDigitOfNo {
   public static void main(String[] args) {
	   
	   int num =12345;
	   int max =num%10;;
	   
	   while(num>0) {
		 if(num%10 > max) {
			 max = max%10;
		 }
		   num = num/10;
	   }
	   System.out.println(max);
   }
}
