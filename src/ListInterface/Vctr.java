package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Vctr {
  public static void main(String[] args) {
	
	  Vector <String> myList = new Vector<String>();
  	myList.add("Ravi");
  	myList.add("Vijay");
  	myList.add("Ravi");
  	myList.add("Ajay");
  	
  	
  	Iterator <String> itr = myList.iterator();
  	while(itr.hasNext()) {
  		System.out.println(itr.next());
}
}
}