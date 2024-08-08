package MapInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashmapClass {
	@SuppressWarnings("removal")
	public static void main(String[] args) {

		// Create HashMap
		HashMap<String, Long> hm = new HashMap<>();

		String name, str = "";
		Long phno;
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1 Enter phone entries");
			System.out.println("2 Loopkup in the book");
			System.out.println("3 Display name sin the book");
			System.out.println("4 exit");

			System.out.println("Enter your choice : ");
			int n = Integer.parseInt(sc.nextLine());

			switch (n) {
			case 1:
				System.out.println("Enter your name : ");
				name = sc.nextLine();
				System.out.println("Enter phno : ");
				try {
					phno = sc.nextLong();
					phno = new Long(str);
					hm.put(name, phno);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Can't format the Integer to String");
				}

			case 2:
				System.out.println("Enter your name : ");
				name = sc.nextLine();
				name = name.trim(); // remove unnecessary
				phno = hm.get(name);
				System.out.println("phno :" + phno);
				break;
			case 3:
				Set<String> set = new HashSet<>();
				set = hm.keySet();
				System.out.println(set);
				break;
			case 4:
				return;

			}
		}

	}
}
