package Array;

public class Print2DimensionalArr {
     
	
	public static void main(String[] args) {
		int arr[][] = new int[2][2];  //instantaion and declaration
		
		arr[0][0]= 1;
		arr[0][1] =2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+ "");
			}
			System.out.println();
		}
		
		
		
	}
}
