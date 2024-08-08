package MasterClass;

public class Loops {
   
	public static void main(String[] args) {
		
		int[] myArray = {2,4,6,8};
		
	/*	for(int i=0;i<myArray.length;i++) {*/
		for(int i : myArray) {
			if(i==6) {
				break;
				
				//coninue ;; Will skip that iteration and continue further 
			}
			System.out.println(i);
		}
	}
}
