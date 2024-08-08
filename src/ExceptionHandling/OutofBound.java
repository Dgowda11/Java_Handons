package ExceptionHandling;

public class OutofBound {
   
	public static void main(String[] args) {
		
		int a[]= new int[4];
		
		try {
			a[4] =10;
			System.out.println(a[4]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter within the range");
		}
	}
}
