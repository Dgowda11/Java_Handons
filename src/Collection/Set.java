package Collection;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
	HashSet<String> myset = new HashSet();
	myset.add("Apple");
	myset.add("orange");
	myset.add("Grapes");
	System.out.println(myset);
	String[] arr = {"Mango,Watermelon,Strawberry"};
	HashSet<Integer> newset = new HashSet();
	for (String Fruits : arr) {
	    System.out.println(Fruits);
	     	}
	}
}
