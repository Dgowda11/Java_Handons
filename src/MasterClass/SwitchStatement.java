package MasterClass;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int guess =2;
		/*
		 * switch (guess) {
		 * 
		 * case 1 : { System.out.println("Guess is 1"); break; } case 2 : {
		 * System.out.println("Guess is 2"); break; } case 3 : {
		 * System.out.println("Gues is 3"); break; } default:{
		 * System.out.println("Guess is greater than 3 or less than 1"); } }
		 */
		
		String Day = "Sunday";
		switch(Day) {
		  
		case "Monday" : {
			System.out.println("its Day 1");
		}
		case "Tuesday" : {
			System.out.println("Its Day 2");
		}
		case "Wednesday" : {
			System.out.println("Its Day 3");
		}
		case "Thursday" :{
			System.out.println("its day 4");
			
		}
		case "Friday" : {
			System.out.println("Its day 5");
		}
		case " satuday" : {
		     System.out.println("Its dy 6");
		}
		default : {
			System.out.println("its sunday :)");
		}
		}
	}

}
