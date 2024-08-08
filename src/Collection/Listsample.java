package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Listsample {
   public static void main(String[] args) {
	   ArrayList <String> myList = new ArrayList();
	   myList.add("Apple");
	   myList.add("Bananna");
	   myList.add("Mango");
	   myList.add("Grapes");
	   Collections.sort(myList);
	   System.out.println(myList);
	   for(String s : myList) {
		   System.out.println(s);
	   }
   }
}
