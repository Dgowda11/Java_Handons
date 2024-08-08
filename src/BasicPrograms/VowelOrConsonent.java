package BasicPrograms;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {

		boolean isVowel = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		sc.close();

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;
		}
		if (isVowel == true) {
			System.out.println(ch + " is a Vowel");
		} else {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println(ch + " is a consonent");
			else
				System.out.println("Input is not a alphabet");
		}

	}
}
