package demo.copy2;

public class No1to50DivBy5Or3 {
   
	public static void main(String[] args) {
		
		for(int i=0;i<50;i++) {
			if(i%5==0 || i%3==0) {
				System.out.println(+i);
			}
		}
	}
}
