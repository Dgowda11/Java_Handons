package Array;

public class PassArrayToMethod {
	public static void findM( int[] arrayOne){
		int max = arrayOne[0];
		for (int i=1; i<arrayOne.length; i++ ){
			if (max<arrayOne[i]){
				max = arrayOne[i];
			}
		}
		System.out.println("Maximum elemnt is "+ max);
		}

	public static void main(String[] args) {
		PassArrayToMethod Pass = new PassArrayToMethod();
		int arraytest[] = { 10,12,14,15};
	 Pass.findM(arraytest);
       
	}

}
