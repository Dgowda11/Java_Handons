package Collection;

import java.util.Vector;

public class VectorList {
   
	public static void main(String[] args) {
		Vector<String> myList = new Vector();
		myList.add("A");
		myList.add("B");
		System.out.println(myList);
		for (String s : myList) {
			System.out.println(s);
		}
	}
}
