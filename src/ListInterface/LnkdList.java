package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LnkdList {
	public static void main(String[] args) {
  //items can be removed from both sides
		//poll removes the first element 
		//pop removes the second element 
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ravi");
		myList.add("Vijay");
		myList.add("Ravi");
		myList.add("Ajay");
		myList.add(0, "Darshan");
		myList.addLast("Gowda");
		myList.size();
		System.out.println(myList.indexOf("Gowda"));
	//	myList.remove(3);
		myList.pop();
		

		Iterator<String> itr = myList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		/*
		 * System.out.println(); ListIterator <String> i= myList.listIterator();
		 * while(i.hasNext()) { System.out.println(i.previous());
		 */
	}

}
