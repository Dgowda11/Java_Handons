package PrintPatterns;

public class SquarePattern {
     
	public static void main(String[] args) {
		
		///// Print Pattern 
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
