package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Stck {

	public static void main(String[] args) {
		//LIFO principle i.e Last in First out
		Stack<String> stack = new Stack<String>();
		stack.add("Ayush");
		stack.add("Garvit");
		stack.add("Amit");
		stack.add("Garima");
		stack.push("Darshan");
		stack.capacity();
		stack.hashCode();
		stack.pop();
		System.out.println(stack);
		
		
		//Retreviewing elements in stack
		Iterator itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	}

