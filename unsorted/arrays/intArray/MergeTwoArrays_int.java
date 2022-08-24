
import java.util.Arrays;

public class MergeTwoArrays_int {

	public MergeTwoArrays_int() {
		int[] intOne = new int[] { 1, 3, 5, 7 };
		int[] intTwo = new int[] { 2, 4, 6, 8 };

		int[] mergeArray = new int[intOne.length + intTwo.length];

		for (int index = 0; index < intOne.length; index++) {
			mergeArray[index] = intOne[index];
		}

		for (int index = 0; index < intTwo.length; index++) {
			mergeArray[index + intOne.length] = intTwo[index];
		}

		System.out.println("merge Array");
		System.out.println(Arrays.toString(mergeArray));

		System.out.println("sorted merge array");

		Arrays.sort(mergeArray);
		System.out.println(Arrays.toString(mergeArray));
	}
}
