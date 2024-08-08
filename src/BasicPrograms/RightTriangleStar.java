	package BasicPrograms;
	
	public class RightTriangleStar {
	
		public static void main(String[] args) {
	
			// Number of rows ==8
			/// We will work with the three variables 1. Row >> No of Rows 2.Column>> No of
			// Column
			// 3.>>No of Rows to be printed
	
			// Using Nested forloops
	
			int row, column, numberOfRows = 6;
			for (row=0; row<numberOfRows; row++)
			{
				for (column=0; column<=row; column++)
				{
					System.out.print("* ");
				}
				
				System.out.println();
			}
		}
	}
