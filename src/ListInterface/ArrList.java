package ListInterface;

import java.util.ArrayList;

public class ArrList {
	public static void main(String[] args) {

		// Able to store random values ,Elements can be radomly accessed ,Insertion
		// order is non synchronized
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Ravi");
		myList.add("Vijay");
		myList.add("Ajay");
		System.out.println(myList.contains("Ravi"));
		System.out.println(myList.size());
		System.out.println(myList.get(0));
		System.out.println();
		/*
		 * System.out.println(myList); //travesing using for each loop for(String s :
		 * myList) { System.out.println(s); } System.out.println(); Iterator itr =
		 * myList.iterator(); while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
}
}