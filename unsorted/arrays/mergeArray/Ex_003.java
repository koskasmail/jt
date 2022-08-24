import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex_003 {

	/*** ----[print method]------------ ***/
	private static void printResult(String[] result) {

		System.out.println("After unique sorting (returned value)");
		for (String r : result) {
			System.out.print(r + ", ");
		}
	}

	/// ----[unique array value method]------------///
	private String[] mergeArray(String[] arr1, String[] arr2) {

		/// ----[create String array 'arr' length [arr1 + arr2]------------///
		String[] arr = new String[arr1.length + arr2.length];

		/// ----[arr[] counter]------------///
		int count = 0;

		/// ----[ copy arr1[] to arr[] ]------------///
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i];
			count++;
		}

		/// ----[ copy arr2[] to arr[] ]------------///
		for (int j = 0; j < arr1.length; j++) {
			arr[count++] = arr2[j];
		}

		/// ----[ create "list" and copy "arr[]" to it. ]------------///
		List<String> lists = Arrays.asList(arr);
		System.out.print("\nbefore unique sorting ==> \n" + lists);

		/// ----[ create "set" (HashSet) ]------------///
		Set<String> set = new HashSet<String>();

		/// ----[ "Set" value from "list" array ]------------///
		for (String s : lists) {
			set.add(s);
		}

		System.out.println("\nafter unique sorting ==> \n" + set);

		/// ----[ Convert HashSet -to- String ]------------///
		arr = new String[set.size()];
		set.toArray(arr);

		/// ----[ return a String array 'arr' ]------------///
		return arr;
	}

	/*** ----[taking 2 arrays and returning 1 unique array value]------------ ***/
	public Ex_003() {
		String[] arr1 = new String[] { "a", "b", "c" };
		String[] arr2 = new String[] { "c", "d", "e" };

		String[] arr = mergeArray(arr1, arr2);

		printResult(arr);
	}
}
