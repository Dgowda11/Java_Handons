package Array;

import java.util.Arrays;

public class SortByBuiltin {

	public static void main(String[] args) {

		int a[] = { 10, 22, 43, 56, 7, 12 };

		System.out.println("The array before sorting : " + Arrays.toString(a));

		Arrays.parallelSort(a);
		System.out.println("The array after sorting : " + Arrays.toString(a));
	}

}
