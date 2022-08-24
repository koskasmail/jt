package javaCore.array;

import java.util.Arrays;

public class SortElementInArray_int {

	public SortElementInArray_int() {
		int[] intArray = new int[] { 1, 5, 3, 9, 7 };

		System.out.println("\n----[unsorted array]---- ");

		for (int index = 0; index < intArray.length; index++) {
			System.out.print(intArray[index] + ", ");
		}

		System.out.println("\n----[sorted Array]----");
		Arrays.sort(intArray);

		for (int index = 0; index < intArray.length; index++) {
			System.out.print(intArray[index] + ", ");
		}
	}
}
