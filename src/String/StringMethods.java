package String;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Hello World";

		// 1. char charAt(int index) >> returns a char value at the given index number
		char ch = str.charAt(3);
		System.out.println(ch);

		// 2. String CmpareTo() >> This ,Method compares given string with current
		// String
		String s1 = "hello";
		System.out.println(s1.compareTo(str));

		// 3. Sring Concat() >>> MEthod to join two strings
		String s2 = str.concat(" World");
		System.out.println(s2);

		// 4. Contains() >> Method to search the sequence of characters
		// Sequence present : True otherwise false
		boolean s3 = str.contains("Hello");
		System.out.println(s3);

		// endswith() >> check if the given dtring ends with given suffix
		System.out.println(str.endsWith("World"));

		// equals() >>> campares two string and its case
		System.out.println(str.equals(s1));

		// equalsIgnorecae() >> compares two strings and ignore case
		System.out.println(str.equalsIgnoreCase(s2));
        
		//format() >> returns formatted string by given locale, format and arguments 
		//System.out.println(str.format(s2, args);
	}
}