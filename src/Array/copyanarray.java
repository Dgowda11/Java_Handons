package Array;

public class copyanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int source[] = {1,2,3};
		int dest[] = {4,5,6};
		System.arraycopy(source, 0, dest, 2, 1);
		for (int i=0; i<dest.length; i++){
			System.out.println(dest[i]);
			
		}
		

	}

}
