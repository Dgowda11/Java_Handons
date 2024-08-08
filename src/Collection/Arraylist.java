package Collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
  ArrayList<String> myList = new ArrayList();
      myList.add("Apple");
      myList.add("Orange");
      myList.add("grapes");
      myList.add("Apple");
      myList.remove(3);
      System.out.println(myList);
	}
    }

