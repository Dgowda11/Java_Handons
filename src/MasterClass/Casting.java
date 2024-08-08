package MasterClass;

public class Casting {
   
	///Implicit Casting 
	/*
	 * float f = 58.21f; int x = (int)f;
	 */    
	//   Implicit casting will be done by the java compiler ;
	//Whereas explicit casting should be done by the programmer 
	
	//explicit casting 
	byte x = 10;
	byte y = 20;
	byte z = (byte) (x+y);
	
	
	public static void main(String[] args) {
		Casting obj = new Casting();
		System.out.println(obj.z);
	}
}
