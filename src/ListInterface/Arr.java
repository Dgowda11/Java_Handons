package ListInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arr {  
	public static void main(String[] args) {
		//can have duplicate 
		// array is dyanamic 
		// maintains insertion order
		// allows random access
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Watermelons");
		myList.add("Bananna");
		myList.add("Grapes");
		Collections.sort(myList);

		/*for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));*/
		
	/*	Iterator itr = myList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());*/
			
			
			try {  
				
				//Serailization
				FileOutputStream fis = new FileOutputStream("file");
				ObjectOutputStream oos = new ObjectOutputStream(fis);
				oos.writeObject(myList);
				fis.close();
				oos.close();
				//Deseralization 
				FileInputStream fos = new FileInputStream("file");
				ObjectInputStream oes = new ObjectInputStream(fos);
				ArrayList list = (ArrayList)oes.readObject();
				System.out.println(list);
				
			}catch (Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

