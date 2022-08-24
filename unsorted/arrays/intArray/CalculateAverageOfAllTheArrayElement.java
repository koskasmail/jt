
public class CalculateAverageOfAllTheArrayElement {

	public CalculateAverageOfAllTheArrayElement() {
		int[] intArray = new int[] { 6, 7, 10, 7, 9 };
		int sum = 0;
		
		System.out.println("Total Grade: ");
		for (int index = 0; index < intArray.length; index++) {
			sum = sum + intArray[index];
			System.out.print(intArray[index] + ", ");
		}
		
		float average = sum / intArray.length;
		System.out.println("\n");
		System.out.println("average is: " + average);
	}
}
