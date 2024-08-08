package Array;

public class FindDuplicates {
    public static void main(String[] args) {
		
    	int a[] = {10,22,43,56,10};
    	
    	
    	for(int i=0;i<a.length;i++) {
    		for(int j=i+1; j<a.length;j++) {
    			if(a[j]==a[i]) {
    				System.out.println("The duplicate element is : " +a[j]);
    			}
    		}
    	}
    	
	}
}
