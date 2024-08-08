package Array;

public class CheckForEqual {
	public static void main(String[] args) {
			int a[] = {1,2,3,4};
	int b[] = {1,2,5,4};
	
	boolean status = true;
	 
	if(a.length == b.length) {
		for(int i=0; i<a.length;i++) {
			if(a[i]!=b[i]) {
				status = false;
			}
		}
	}else { status = false; }
	
	if(status == true) {
		System.out.println("Arrays are equal");
	}else {System.out.println("They are not equal");
	
	}
}
}