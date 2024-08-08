package Collection;

import java.util.HashSet;

public class SetCollection {
  public static void main(String[] args) {
	  HashSet<String> mySet = new HashSet<>();
	  mySet.add("Apple");
	  mySet.add("Bananna");
	  mySet.add("Mango");
	  mySet.
	  for(String s : mySet) {
		  System.out.println(s);
	  }
	  System.out.println(" ");
	  HashSet<String> newSet = new HashSet<>(mySet);
	  newSet.add("Watermelon");
	  for(String r : newSet) {
		  System.out.println(r);
	  }
  }
}
