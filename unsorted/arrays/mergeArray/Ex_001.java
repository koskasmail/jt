import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/***----[class purpose: convert arrays to arrays with unique array value]------------***/
public class Ex_001 {

	/***----[print method]------------***/
	private void printResult(List<String> result) {
		for (String r : result) {
			System.out.println(r);
		}
	}
	
	/***----[unique array value method]------------***/
	public static List<String> uniqueNames(String[] arr1, String[] arr2) {
		List<String> both = new ArrayList<>(Arrays.asList(arr1));
		return both;
	}

	/***----[taking 2 arrays and returning 1 unique array value]------------***/
	public Ex_001() {
		String[] arr1 = new String[] { "a", "b", "c" };
		String[] arr2 = new String[] { "c", "d", "e" };

		List<String> result = uniqueNames(arr1, arr2);
		printResult(result);
	}
}
